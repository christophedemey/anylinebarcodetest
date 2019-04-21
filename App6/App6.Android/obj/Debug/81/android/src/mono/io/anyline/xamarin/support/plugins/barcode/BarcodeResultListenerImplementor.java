package mono.io.anyline.xamarin.support.plugins.barcode;


public class BarcodeResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.xamarin.support.plugins.barcode.BarcodeResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lio/anyline/xamarin/support/plugins/barcode/BarcodeScanResult;)V:GetOnResult_Lio_anyline_xamarin_support_plugins_barcode_BarcodeScanResult_Handler:IO.Anyline.Xamarin.Support.Plugins.Barcode.IBarcodeResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Xamarin.Support.Plugins.Barcode.IBarcodeResultListenerImplementor, AnylineXamarinSDK.Droid", BarcodeResultListenerImplementor.class, __md_methods);
	}


	public BarcodeResultListenerImplementor ()
	{
		super ();
		if (getClass () == BarcodeResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Xamarin.Support.Plugins.Barcode.IBarcodeResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (io.anyline.xamarin.support.plugins.barcode.BarcodeScanResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (io.anyline.xamarin.support.plugins.barcode.BarcodeScanResult p0);

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
