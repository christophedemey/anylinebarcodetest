package mono.at.nineyards.anyline.camera;


public class ActiveArrayZoomHandler_IZoomHandlerListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anyline.camera.ActiveArrayZoomHandler.IZoomHandlerListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onZoomChanged:(Landroid/graphics/Rect;)V:GetOnZoomChanged_Landroid_graphics_Rect_Handler:AT.Nineyards.Anyline.Camera.ActiveArrayZoomHandler/IZoomHandlerListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anyline.Camera.ActiveArrayZoomHandler+IZoomHandlerListenerImplementor, AnylineXamarinSDK.Droid", ActiveArrayZoomHandler_IZoomHandlerListenerImplementor.class, __md_methods);
	}


	public ActiveArrayZoomHandler_IZoomHandlerListenerImplementor ()
	{
		super ();
		if (getClass () == ActiveArrayZoomHandler_IZoomHandlerListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anyline.Camera.ActiveArrayZoomHandler+IZoomHandlerListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onZoomChanged (android.graphics.Rect p0)
	{
		n_onZoomChanged (p0);
	}

	private native void n_onZoomChanged (android.graphics.Rect p0);

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
