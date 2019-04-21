package mono.at.nineyards.anyline.camera;


public class SimpleZoomHandler_IZoomHandlerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anyline.camera.SimpleZoomHandler.IZoomHandlerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onZoomChanged:(I)V:GetOnZoomChanged_IHandler:AT.Nineyards.Anyline.Camera.SimpleZoomHandler/IZoomHandlerListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anyline.Camera.SimpleZoomHandler+IZoomHandlerListenerImplementor, AnylineXamarinSDK.Droid", SimpleZoomHandler_IZoomHandlerListenerImplementor.class, __md_methods);
	}


	public SimpleZoomHandler_IZoomHandlerListenerImplementor ()
	{
		super ();
		if (getClass () == SimpleZoomHandler_IZoomHandlerListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anyline.Camera.SimpleZoomHandler+IZoomHandlerListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onZoomChanged (int p0)
	{
		n_onZoomChanged (p0);
	}

	private native void n_onZoomChanged (int p0);

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
