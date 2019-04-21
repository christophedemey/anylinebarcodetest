package mono.at.nineyards.anyline.modules;


public class AnylineModuleResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anyline.modules.AnylineModuleResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResult:(Lat/nineyards/anyline/models/AnylineScanResult;)V:GetOnResult_Lat_nineyards_anyline_models_AnylineScanResult_Handler:AT.Nineyards.Anyline.Modules.IAnylineModuleResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anyline.Modules.IAnylineModuleResultListenerImplementor, AnylineXamarinSDK.Droid", AnylineModuleResultListenerImplementor.class, __md_methods);
	}


	public AnylineModuleResultListenerImplementor ()
	{
		super ();
		if (getClass () == AnylineModuleResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anyline.Modules.IAnylineModuleResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onResult (at.nineyards.anyline.models.AnylineScanResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (at.nineyards.anyline.models.AnylineScanResult p0);

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
