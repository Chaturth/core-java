class File {

    String name;
    int size;
    String location;
    boolean readable;
    int version;

    Folder folder;
    Owner owner;
    Permission permission;
    Metadata metadata;
    Storagedevice storagedevice;

    File(String name,int size,String location,boolean readable,int version,
         Folder folder,Owner owner,Permission permission,Metadata metadata,Storagedevice storagedevice){

        this.name = name;
        this.size = size;
        this.location = location;
        this.readable = readable;
        this.version = version;
        this.folder = folder;
        this.owner = owner;
        this.permission = permission;
        this.metadata = metadata;
        this.storagedevice = storagedevice;
    }

    void getInfo(){

        System.out.println(name);
        System.out.println(size);
        System.out.println(location);
        System.out.println(readable);
        System.out.println(version);

        if(folder != null)
            folder.getInfo();

        if(owner != null)
            owner.getInfo();

        if(permission != null)
            permission.getInfo();

        if(metadata != null)
            metadata.getInfo();

        if(storagedevice != null)
            storagedevice.getInfo();
    }
}
	

