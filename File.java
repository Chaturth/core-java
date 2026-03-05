
class File{
	
	String filename;
	double filesize;
	String fileStored;
	boolean isProgram;
	int quantity;
	
	Folder folder;
    Owner owner;
	Permission permission;
	Metadata metadata;
	Storagedevice storagedevice;
	
	File(String filename,
	double filesize,
	String fileStored,
	boolean isProgram,
	int quantity,
	
	Folder folder,
    Owner owner,
	Permission permission,
	Metadata metadata,
	Storagedevice storagedevice)
	
	{
		this.filename=filename;
		this.filesize=filesize;
		this.fileStored=fileStored;
		this.isProgram=isProgram;
		this.quantity=quantity;
		this.folder=folder;
		this.owner=owner;
		this.permission=permission;
		this.metadata=metadata;
		this.storagedevice=storagedevice;
	}
}

