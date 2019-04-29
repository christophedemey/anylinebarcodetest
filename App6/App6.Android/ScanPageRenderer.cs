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
    class ScanPageRenderer : PageRenderer, IBarcodeResultListener, IScanResultListener
    {
        private Android.Views.View _view;
        private ScanView _scanView;
        
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

        public void OnResult(BarcodeScanResult scanResult)
        {
            Log.Debug(typeof(ScanPageRenderer).Name, "Result: " + scanResult.Result.ToString());
            Toast.MakeText(Context, scanResult.Result.ToString(), ToastLength.Long).Show();
        }

        public void OnResult(ScanResult result)
        {
            int x = 1 + 1; 
        }
    }
}