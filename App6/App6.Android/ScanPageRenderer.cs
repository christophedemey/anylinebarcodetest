using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Util;
using Android.Views;
using Android.Widget;
using App6;
using App6.Droid;
using IO.Anyline.Xamarin.Support.Plugins.Barcode;
using IO.Anyline.View;
using Xamarin.Forms;
using Xamarin.Forms.Platform.Android;
using IO.Anyline.Plugin;

[assembly: ExportRenderer(typeof(ScanPage), typeof(ScanPageRenderer))]

namespace App6.Droid
{
    class ScanPageRenderer : PageRenderer, IScanResultListener
    {
        private Android.Views.View _view;
        private ScanView _scanView;
        //eyAiYW5kcm9pZElkZW50aWZpZXIiOiBbICJBVC5BbnlsaW5lLlhhbWFyaW4uQXBwLkRyb2lkIiwgIkFULkFueWxpbmUuWGFtYXJpbi5Gb3Jtcy5BcHAuRHJvaWQiIF0sICJkZWJ1Z1JlcG9ydGluZyI6ICJvbiIsICJpb3NJZGVudGlmaWVyIjogWyAiQVQuQW55bGluZS5YYW1hcmluLkFwcC5pT1MiLCAiQVQuQW55bGluZS5YYW1hcmluLkZvcm1zLkFwcC5pT1MiIF0sICJsaWNlbnNlS2V5VmVyc2lvbiI6IDIsICJtYWpvclZlcnNpb24iOiAiMyIsICJwaW5nUmVwb3J0aW5nIjogdHJ1ZSwgInBsYXRmb3JtIjogWyAiaU9TIiwgIkFuZHJvaWQiIF0sICJzY29wZSI6IFsgIkFMTCIgXSwgInNob3dXYXRlcm1hcmsiOiB0cnVlLCAidG9sZXJhbmNlRGF5cyI6IDkwLCAidmFsaWQiOiAiMjAyMC0wMS0wMSIgfQprcS9WL0wrSGlpN0NzL2tXa1E5VWRzbGxzd0hOanphelZEZ2Z2WU1LLytJN1VHYmlITy9SblMrdGZIeUZxQmlJCkN3QXkrdkk5RnJpOVc5MStGdjJTS2FJNS8vLzZhUVgyVXlSVC9CaVRKM1QzTXBVOEIrMWpFZTQxbCtXejRqaFgKMlZ6dENpT2E3cit3d2RlTm1GUFpxdGVUTG5BRmgxQWgycDZpMzgyMWhOb3FsVHNxcFlJdjN3cWdCbWg5clh2WgpBM01pRnpkZ0dab1gzbzNINzFGRUtJME9JSy9ZRkNJRk5nVEI0MFhBM3ZTOXk2ak1FR2E5bjVQRHY5MU5NZEFRCnlHTzcxRVVuZE9ndmJmTkJWbVJYNUR1MGVrZ0RGYUNFMUwweVpUQ3dhMFJVTStLSE9PcXA3TThYOWVFdjJ0RVkKVEcyejdydGQ5YytiRlBvTU5vcUpwZz09Cg
        public const string LicenseKey = "eyJzY29wZSI6WyJBTEwiXSwicGxhdGZvcm0iOlsiaU9TIiwiQW5kcm9pZCIsIldpbmRvd3MiXSwidmFsaWQiOiIyMDE5LTA1LTIxIiwibWFqb3JWZXJzaW9uIjozLCJtYXhEYXlzTm90UmVwb3J0ZWQiOjUsInNob3dXYXRlcm1hcmsiOnRydWUsInBpbmdSZXBvcnRpbmciOnRydWUsImRlYnVnUmVwb3J0aW5nIjoib3B0LW91dCIsInRvbGVyYW5jZURheXMiOjUsInNob3dQb3BVcEFmdGVyRXhwaXJ5Ijp0cnVlLCJpb3NJZGVudGlmaWVyIjpbImNvbS5jb21wYW55bmFtZS5hZ2FpbiJdLCJhbmRyb2lkSWRlbnRpZmllciI6WyJjb20uY29tcGFueW5hbWUuYWdhaW4iXSwid2luZG93c0lkZW50aWZpZXIiOlsiY29tLmNvbXBhbnluYW1lLmFnYWluIl19CmF5Lyt6ZW1Cdk9XYTZEU3R0OEdsOG91MGpGaVcydzg4QmVRQy9UN3hvVS85RVMyL3RJMkhrYXhTa3hLNkgxanAzZGQ3L1dGL25na2VZSG1qN25XMzF5OVM4STZCUEpPNWU3TFhpZitFajNRYWRHTk1nY1FhVjh3WnV1UU1waTdOTXdnM3d5SXlLYXczcndxa05xb1laV0dzYTR5cys1RGJSVkozSU40LzdSOFpRbVJFTlh5SUFzOEZVUVhLcHFWK2RmRXNUQ0drcmV5RzhqbFhMenNscW9wQVlxNzdJVFVvZEhTWjY2Vld3cnN6YjBhdlNUcGgxQ0lGejMvVFB0WVFWSzRCai9RUmdvSEIrVjd4d2ZXMkhac0IzY2JmK3lKbnhTeEtiM0FXMW5tYlNoT3dZZFBKZVdKL08rekVDT01ONjVlRW5BTk1Sdlk1MWNGWk9pakQ4UT09==";

        public ScanPageRenderer(Context context) : base(context)
        {
        }
        protected override void OnElementChanged(ElementChangedEventArgs<Page> e)
        {
            base.OnElementChanged(e);

            if (_view == null)
            {
                var activity = Context as Activity;
                _view = activity.LayoutInflater.Inflate(Resource.Layout.ScanLayout, this, false);

                _scanView = _view.FindViewById<ScanView>(Resource.Id.scan_view);
                _scanView.Init("others_config_barcode.json", LicenseKey);
                _scanView.Start();
                AddView(_view);
             }
        }

        protected override void OnLayout(bool changed, int l, int t, int r, int b)
        {
            base.OnLayout(changed, l, t, r, b);
            var msw = MeasureSpec.MakeMeasureSpec(r - l, MeasureSpecMode.Exactly);
            var msh = MeasureSpec.MakeMeasureSpec(b - t, MeasureSpecMode.Exactly);
            _view.Measure(msw, msh);
            _view.Layout(0, 0, r - l, b - t);
        }

        public void OnResult(ScanResult result)
        {
            Log.Debug(typeof(ScanPageRenderer).Name, "Result: " + result.Result.ToString());
            Toast.MakeText(Context, result.Result.ToString(), ToastLength.Long).Show();
        }
    }
}