package mono.io.anyline.view;


public class LightLevelHelper_LightLevelListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.view.LightLevelHelper.LightLevelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLightLevelChanged:(Lio/anyline/view/LightLevelHelper$BrightnessLevel;Lio/anyline/view/LightLevelHelper$AmbientLightLevel;)V:GetOnLightLevelChanged_Lio_anyline_view_LightLevelHelper_BrightnessLevel_Lio_anyline_view_LightLevelHelper_AmbientLightLevel_Handler:IO.Anyline.View.LightLevelHelper/ILightLevelListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.View.LightLevelHelper+ILightLevelListenerImplementor, AnylineXamarinSDK.Droid", LightLevelHelper_LightLevelListenerImplementor.class, __md_methods);
	}


	public LightLevelHelper_LightLevelListenerImplementor ()
	{
		super ();
		if (getClass () == LightLevelHelper_LightLevelListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.View.LightLevelHelper+ILightLevelListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onLightLevelChanged (io.anyline.view.LightLevelHelper.BrightnessLevel p0, io.anyline.view.LightLevelHelper.AmbientLightLevel p1)
	{
		n_onLightLevelChanged (p0, p1);
	}

	private native void n_onLightLevelChanged (io.anyline.view.LightLevelHelper.BrightnessLevel p0, io.anyline.view.LightLevelHelper.AmbientLightLevel p1);

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
