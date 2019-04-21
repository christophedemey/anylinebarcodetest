package mono.io.anyline.xamarin.support.plugins.ocr;


public class AnylineOcrResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.xamarin.support.plugins.ocr.AnylineOcrResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lio/anyline/xamarin/support/plugins/ocr/AnylineOcrScanResult;)V:GetOnResult_Lio_anyline_xamarin_support_plugins_ocr_AnylineOcrScanResult_Handler:IO.Anyline.Xamarin.Support.Plugins.Ocr.IAnylineOcrResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Xamarin.Support.Plugins.Ocr.IAnylineOcrResultListenerImplementor, AnylineXamarinSDK.Droid", AnylineOcrResultListenerImplementor.class, __md_methods);
	}


	public AnylineOcrResultListenerImplementor ()
	{
		super ();
		if (getClass () == AnylineOcrResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Xamarin.Support.Plugins.Ocr.IAnylineOcrResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (io.anyline.xamarin.support.plugins.ocr.AnylineOcrScanResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (io.anyline.xamarin.support.plugins.ocr.AnylineOcrScanResult p0);

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
