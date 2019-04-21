package mono.at.nineyards.anylinexamarin.support.modules.licenseplate;


public class LicensePlateResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anylinexamarin.support.modules.licenseplate.LicensePlateResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lat/nineyards/anyline/modules/licenseplate/LicensePlateResult;)V:GetOnResult_Lat_nineyards_anyline_modules_licenseplate_LicensePlateResult_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.LicensePlate.ILicensePlateResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anylinexamarin.Support.Modules.LicensePlate.ILicensePlateResultListenerImplementor, AnylineXamarinSDK.Droid", LicensePlateResultListenerImplementor.class, __md_methods);
	}


	public LicensePlateResultListenerImplementor ()
	{
		super ();
		if (getClass () == LicensePlateResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anylinexamarin.Support.Modules.LicensePlate.ILicensePlateResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (at.nineyards.anyline.modules.licenseplate.LicensePlateResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (at.nineyards.anyline.modules.licenseplate.LicensePlateResult p0);

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
