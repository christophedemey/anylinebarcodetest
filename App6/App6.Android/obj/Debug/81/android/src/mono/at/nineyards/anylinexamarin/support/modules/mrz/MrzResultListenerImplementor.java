package mono.at.nineyards.anylinexamarin.support.modules.mrz;


public class MrzResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anylinexamarin.support.modules.mrz.MrzResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lat/nineyards/anyline/modules/mrz/MrzResult;)V:GetOnResult_Lat_nineyards_anyline_modules_mrz_MrzResult_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Mrz.IMrzResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anylinexamarin.Support.Modules.Mrz.IMrzResultListenerImplementor, AnylineXamarinSDK.Droid", MrzResultListenerImplementor.class, __md_methods);
	}


	public MrzResultListenerImplementor ()
	{
		super ();
		if (getClass () == MrzResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anylinexamarin.Support.Modules.Mrz.IMrzResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (at.nineyards.anyline.modules.mrz.MrzResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (at.nineyards.anyline.modules.mrz.MrzResult p0);

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
