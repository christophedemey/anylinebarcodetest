package mono.io.anyline.view;


public class CutoutConfigChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.view.CutoutConfigChangedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCutoutConfigChanged:(Lio/anyline/view/CutoutConfig;)V:GetOnCutoutConfigChanged_Lio_anyline_view_CutoutConfig_Handler:IO.Anyline.View.ICutoutConfigChangedListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.View.ICutoutConfigChangedListenerImplementor, AnylineXamarinSDK.Droid", CutoutConfigChangedListenerImplementor.class, __md_methods);
	}


	public CutoutConfigChangedListenerImplementor ()
	{
		super ();
		if (getClass () == CutoutConfigChangedListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.View.ICutoutConfigChangedListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCutoutConfigChanged (io.anyline.view.CutoutConfig p0)
	{
		n_onCutoutConfigChanged (p0);
	}

	private native void n_onCutoutConfigChanged (io.anyline.view.CutoutConfig p0);

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
