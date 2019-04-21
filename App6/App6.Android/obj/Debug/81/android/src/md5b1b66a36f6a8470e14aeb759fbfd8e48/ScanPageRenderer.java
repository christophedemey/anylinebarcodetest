package md5b1b66a36f6a8470e14aeb759fbfd8e48;


public class ScanPageRenderer
	extends md51558244f76c53b6aeda52c8a337f2c37.PageRenderer
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anylinexamarin.support.modules.barcode.BarcodeResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onResult:(Lat/nineyards/anyline/modules/barcode/BarcodeResult;)V:GetOnResult_Lat_nineyards_anyline_modules_barcode_BarcodeResult_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Barcode.IBarcodeResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("App6.Droid.ScanPageRenderer, App6.Android", ScanPageRenderer.class, __md_methods);
	}


	public ScanPageRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ScanPageRenderer.class)
			mono.android.TypeManager.Activate ("App6.Droid.ScanPageRenderer, App6.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ScanPageRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ScanPageRenderer.class)
			mono.android.TypeManager.Activate ("App6.Droid.ScanPageRenderer, App6.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ScanPageRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ScanPageRenderer.class)
			mono.android.TypeManager.Activate ("App6.Droid.ScanPageRenderer, App6.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void onResult (at.nineyards.anyline.modules.barcode.BarcodeResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (at.nineyards.anyline.modules.barcode.BarcodeResult p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
