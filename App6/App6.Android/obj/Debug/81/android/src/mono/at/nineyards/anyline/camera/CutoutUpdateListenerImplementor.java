package mono.at.nineyards.anyline.camera;


public class CutoutUpdateListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anyline.camera.CutoutUpdateListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCutoutUpdate:(Landroid/graphics/Rect;Landroid/graphics/Rect;)V:GetOnCutoutUpdate_Landroid_graphics_Rect_Landroid_graphics_Rect_Handler:AT.Nineyards.Anyline.Camera.ICutoutUpdateListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anyline.Camera.ICutoutUpdateListenerImplementor, AnylineXamarinSDK.Droid", CutoutUpdateListenerImplementor.class, __md_methods);
	}


	public CutoutUpdateListenerImplementor ()
	{
		super ();
		if (getClass () == CutoutUpdateListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anyline.Camera.ICutoutUpdateListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCutoutUpdate (android.graphics.Rect p0, android.graphics.Rect p1)
	{
		n_onCutoutUpdate (p0, p1);
	}

	private native void n_onCutoutUpdate (android.graphics.Rect p0, android.graphics.Rect p1);

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
