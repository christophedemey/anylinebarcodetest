package mono.at.nineyards.anyline.camera;


public class CameraOpenListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anyline.camera.CameraOpenListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraError:(Ljava/lang/Exception;)V:GetOnCameraError_Ljava_lang_Exception_Handler:AT.Nineyards.Anyline.Camera.ICameraOpenListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onCameraOpened:(Lat/nineyards/anyline/camera/CameraController;II)V:GetOnCameraOpened_Lat_nineyards_anyline_camera_CameraController_IIHandler:AT.Nineyards.Anyline.Camera.ICameraOpenListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anyline.Camera.ICameraOpenListenerImplementor, AnylineXamarinSDK.Droid", CameraOpenListenerImplementor.class, __md_methods);
	}


	public CameraOpenListenerImplementor ()
	{
		super ();
		if (getClass () == CameraOpenListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anyline.Camera.ICameraOpenListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onCameraError (java.lang.Exception p0)
	{
		n_onCameraError (p0);
	}

	private native void n_onCameraError (java.lang.Exception p0);


	public void onCameraOpened (at.nineyards.anyline.camera.CameraController p0, int p1, int p2)
	{
		n_onCameraOpened (p0, p1, p2);
	}

	private native void n_onCameraOpened (at.nineyards.anyline.camera.CameraController p0, int p1, int p2);

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
