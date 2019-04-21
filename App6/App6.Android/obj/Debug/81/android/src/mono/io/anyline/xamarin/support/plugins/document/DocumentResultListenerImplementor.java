package mono.io.anyline.xamarin.support.plugins.document;


public class DocumentResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		io.anyline.xamarin.support.plugins.document.DocumentResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentOutlineDetected:(Ljava/util/List;Z)Z:GetOnDocumentOutlineDetected_Ljava_util_List_ZHandler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPictureCornersDetected:(Lat/nineyards/anyline/models/AnylineImage;Ljava/util/List;)V:GetOnPictureCornersDetected_Lat_nineyards_anyline_models_AnylineImage_Ljava_util_List_Handler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPictureProcessingFailure:(Lio/anyline/plugin/document/DocumentScanViewPlugin$DocumentError;)V:GetOnPictureProcessingFailure_Lio_anyline_plugin_document_DocumentScanViewPlugin_DocumentError_Handler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPictureTransformError:(Lio/anyline/plugin/document/DocumentScanViewPlugin$DocumentError;)V:GetOnPictureTransformError_Lio_anyline_plugin_document_DocumentScanViewPlugin_DocumentError_Handler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPictureTransformed:(Lat/nineyards/anyline/models/AnylineImage;)V:GetOnPictureTransformed_Lat_nineyards_anyline_models_AnylineImage_Handler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPreviewProcessingFailure:(Lio/anyline/plugin/document/DocumentScanViewPlugin$DocumentError;)V:GetOnPreviewProcessingFailure_Lio_anyline_plugin_document_DocumentScanViewPlugin_DocumentError_Handler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPreviewProcessingSuccess:(Lat/nineyards/anyline/models/AnylineImage;)V:GetOnPreviewProcessingSuccess_Lat_nineyards_anyline_models_AnylineImage_Handler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onResult:(Lio/anyline/plugin/ScanResult;)V:GetOnResult_Lio_anyline_plugin_ScanResult_Handler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onTakePictureError:(Ljava/lang/Throwable;)V:GetOnTakePictureError_Ljava_lang_Throwable_Handler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onTakePictureSuccess:()V:GetOnTakePictureSuccessHandler:IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerImplementor, AnylineXamarinSDK.Droid", DocumentResultListenerImplementor.class, __md_methods);
	}


	public DocumentResultListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("IO.Anyline.Xamarin.Support.Plugins.Document.IDocumentResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
	}


	public boolean onDocumentOutlineDetected (java.util.List p0, boolean p1)
	{
		return n_onDocumentOutlineDetected (p0, p1);
	}

	private native boolean n_onDocumentOutlineDetected (java.util.List p0, boolean p1);


	public void onPictureCornersDetected (at.nineyards.anyline.models.AnylineImage p0, java.util.List p1)
	{
		n_onPictureCornersDetected (p0, p1);
	}

	private native void n_onPictureCornersDetected (at.nineyards.anyline.models.AnylineImage p0, java.util.List p1);


	public void onPictureProcessingFailure (io.anyline.plugin.document.DocumentScanViewPlugin.DocumentError p0)
	{
		n_onPictureProcessingFailure (p0);
	}

	private native void n_onPictureProcessingFailure (io.anyline.plugin.document.DocumentScanViewPlugin.DocumentError p0);


	public void onPictureTransformError (io.anyline.plugin.document.DocumentScanViewPlugin.DocumentError p0)
	{
		n_onPictureTransformError (p0);
	}

	private native void n_onPictureTransformError (io.anyline.plugin.document.DocumentScanViewPlugin.DocumentError p0);


	public void onPictureTransformed (at.nineyards.anyline.models.AnylineImage p0)
	{
		n_onPictureTransformed (p0);
	}

	private native void n_onPictureTransformed (at.nineyards.anyline.models.AnylineImage p0);


	public void onPreviewProcessingFailure (io.anyline.plugin.document.DocumentScanViewPlugin.DocumentError p0)
	{
		n_onPreviewProcessingFailure (p0);
	}

	private native void n_onPreviewProcessingFailure (io.anyline.plugin.document.DocumentScanViewPlugin.DocumentError p0);


	public void onPreviewProcessingSuccess (at.nineyards.anyline.models.AnylineImage p0)
	{
		n_onPreviewProcessingSuccess (p0);
	}

	private native void n_onPreviewProcessingSuccess (at.nineyards.anyline.models.AnylineImage p0);


	public void onResult (io.anyline.plugin.ScanResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (io.anyline.plugin.ScanResult p0);


	public void onTakePictureError (java.lang.Throwable p0)
	{
		n_onTakePictureError (p0);
	}

	private native void n_onTakePictureError (java.lang.Throwable p0);


	public void onTakePictureSuccess ()
	{
		n_onTakePictureSuccess ();
	}

	private native void n_onTakePictureSuccess ();

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
