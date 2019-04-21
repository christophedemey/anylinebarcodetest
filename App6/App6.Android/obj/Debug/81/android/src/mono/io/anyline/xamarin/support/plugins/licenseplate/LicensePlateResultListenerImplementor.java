package mono.io.anyline.xamarin.support.plugins.licenseplate;


public class LicensePlateResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.xamarin.support.plugins.licenseplate.LicensePlateResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lio/anyline/xamarin/support/plugins/licenseplate/LicensePlateScanResult;)V:GetOnResult_Lio_anyline_xamarin_support_plugins_licenseplate_LicensePlateScanResult_Handler:IO.Anyline.Xamarin.Support.Plugins.Licenseplate.ILicensePlateResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Xamarin.Support.Plugins.Licenseplate.ILicensePlateResultListenerImplementor, AnylineXamarinSDK.Droid", LicensePlateResultListenerImplementor.class, __md_methods);
	}


	public LicensePlateResultListenerImplementor ()
	{
		super ();
		if (getClass () == LicensePlateResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Xamarin.Support.Plugins.Licenseplate.ILicensePlateResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (io.anyline.xamarin.support.plugins.licenseplate.LicensePlateScanResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (io.anyline.xamarin.support.plugins.licenseplate.LicensePlateScanResult p0);

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
