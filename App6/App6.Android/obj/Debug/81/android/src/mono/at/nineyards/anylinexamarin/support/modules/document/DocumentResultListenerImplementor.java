package mono.at.nineyards.anylinexamarin.support.modules.document;


public class DocumentResultListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		at.nineyards.anylinexamarin.support.modules.document.DocumentResultListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDocumentOutlineDetected:(Ljava/util/List;Z)Z:GetOnDocumentOutlineDetected_Ljava_util_List_ZHandler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPictureCornersDetected:(Lat/nineyards/anyline/models/AnylineImage;Ljava/util/List;)V:GetOnPictureCornersDetected_Lat_nineyards_anyline_models_AnylineImage_Ljava_util_List_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPictureProcessingFailure:(Lat/nineyards/anyline/modules/document/DocumentScanView$DocumentError;)V:GetOnPictureProcessingFailure_Lat_nineyards_anyline_modules_document_DocumentScanView_DocumentError_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPictureTransformError:(Lat/nineyards/anyline/modules/document/DocumentScanView$DocumentError;)V:GetOnPictureTransformError_Lat_nineyards_anyline_modules_document_DocumentScanView_DocumentError_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPictureTransformed:(Lat/nineyards/anyline/models/AnylineImage;)V:GetOnPictureTransformed_Lat_nineyards_anyline_models_AnylineImage_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPreviewProcessingFailure:(Lat/nineyards/anyline/modules/document/DocumentScanView$DocumentError;)V:GetOnPreviewProcessingFailure_Lat_nineyards_anyline_modules_document_DocumentScanView_DocumentError_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onPreviewProcessingSuccess:(Lat/nineyards/anyline/models/AnylineImage;)V:GetOnPreviewProcessingSuccess_Lat_nineyards_anyline_models_AnylineImage_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onResult:(Lat/nineyards/anyline/modules/document/DocumentResult;)V:GetOnResult_Lat_nineyards_anyline_modules_document_DocumentResult_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onTakePictureError:(Ljava/lang/Throwable;)V:GetOnTakePictureError_Ljava_lang_Throwable_Handler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"n_onTakePictureSuccess:()V:GetOnTakePictureSuccessHandler:AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerInvoker, AnylineXamarinSDK.Droid\n" +
			"";
		mono.android.Runtime.register ("AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerImplementor, AnylineXamarinSDK.Droid", DocumentResultListenerImplementor.class, __md_methods);
	}


	public DocumentResultListenerImplementor ()
	{
		super ();
		if (getClass () == DocumentResultListenerImplementor.class)
			mono.android.TypeManager.Activate ("AT.Nineyards.Anylinexamarin.Support.Modules.Document.IDocumentResultListenerImplementor, AnylineXamarinSDK.Droid", "", this, new java.lang.Object[] {  });
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


	public void onPictureProcessingFailure (at.nineyards.anyline.modules.document.DocumentScanView.DocumentError p0)
	{
		n_onPictureProcessingFailure (p0);
	}

	private native void n_onPictureProcessingFailure (at.nineyards.anyline.modules.document.DocumentScanView.DocumentError p0);


	public void onPictureTransformError (at.nineyards.anyline.modules.document.DocumentScanView.DocumentError p0)
	{
		n_onPictureTransformError (p0);
	}

	private native void n_onPictureTransformError (at.nineyards.anyline.modules.document.DocumentScanView.DocumentError p0);


	public void onPictureTransformed (at.nineyards.anyline.models.AnylineImage p0)
	{
		n_onPictureTransformed (p0);
	}

	private native void n_onPictureTransformed (at.nineyards.anyline.models.AnylineImage p0);


	public void onPreviewProcessingFailure (at.nineyards.anyline.modules.document.DocumentScanView.DocumentError p0)
	{
		n_onPreviewProcessingFailure (p0);
	}

	private native void n_onPreviewProcessingFailure (at.nineyards.anyline.modules.document.DocumentScanView.DocumentError p0);


	public void onPreviewProcessingSuccess (at.nineyards.anyline.models.AnylineImage p0)
	{
		n_onPreviewProcessingSuccess (p0);
	}

	private native void n_onPreviewProcessingSuccess (at.nineyards.anyline.models.AnylineImage p0);


	public void onResult (at.nineyards.anyline.modules.document.DocumentResult p0)
	{
		n_onResult (p0);
	}

	private native void n_onResult (at.nineyards.anyline.modules.document.DocumentResult p0);


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
