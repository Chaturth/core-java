class Carpenter {

    String[] tools;
    Material[] materials;

    Carpenter(String[] tools, Material[] materials) {
        this.tools = tools;
        this.materials = materials;
    }
	
	void display()
	{
		System.out.println("tools of carpenter:"+tools.length);
		System.out.println("materials of carpenter:"+materials.length);
		
		if(this.tools!=null)
		{
			for(String tool:tools)
			{
				System.out.println("tool:"+tool);
			}
		}
		
			if(this.materials!=null)
		{
			for(Material mat:materials)
			{
				System.out.println("materials:"+mat.materialtype);
			}
		}
	}
}

		
		