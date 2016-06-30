package com.agen.library.vo;


public class Receive {
	
	private String id ;
	private String name ;
	private int managerid;
    private String signs;
    private String receivedate;
    private String receivephone ;
    private String receivename;
   private String  receiveadress;
    private String scanid;
    private String sends;
    private String sendname;
    private String dotime ;
    private String doname;
   private String settlement;
  private  String beizhu;
  private String signtime = "";
  private float cost = (float) 0.00;
  private float daicost  = (float) 0.00;
  private float yingcost = (float) 0.00;
  private float shicost = (float) 0.00; 
  
  public void setsigntime(String signtime){
	  this.signs = signtime;
  }
  
  public String getsigntime(){
	  return signtime;
  }
  
  public void setcost(float cost){
	  this.cost = cost;
  }
  
  public float getcost(){
	  return cost;
  }
  
  public void setdaicost(float daicost){
	  this.daicost = daicost;
  }
  
  public float getdaicost(){
	  return daicost;
  }
  
  public void setyingcost(float yingcost){
	  this.yingcost = yingcost;
  }
  
  public float getyingcost(){
	  return yingcost;
  }
	
  public void setshicost(float shicost){
	  this.shicost = shicost;
  }
  
  public float getshicost(){
	  return shicost;
  }
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setname(String name){
		this.name = name;
	}
	
	public String getname(){
		return name;
	}
	
	public void setmanagerid(int managerid){
		this.managerid = managerid;
	}
	
	public int getmanagerid(){
		return managerid;
	}
	
	public void setsigns(String signs){
		this.signs = signs;
	}
	
	public String getsigns(){
		return signs;
	}
	
	public void setreceivedate(String receivedate){
		this.receivedate = receivedate;
	}
	
	public String getreceivedate(){
		return receivedate;
	}
	
	public void setreceivephone(String receivephone){
		this.receivephone = receivephone;
	}
	
	public String getreceivephone(){
		return receivephone;
	}
	
	public void setreceivename(String receivename){
		this.receivename = receivename;
	}
	
	public String getreceivename(){
		return receivename;
	}
	
	public void setreceiveadress(String receiveadress){
		this.receiveadress = receiveadress;
	}
	public String getreceiveadress(){
		return receiveadress;
	}
	
	public void setscanid(String scanid){
		this.scanid = scanid;
	}
	
	public String getscanid(){
		return scanid;
	}
	
	public void setsends(String sends){
		this.sends = sends;
	}
	
	public String getsends(){
		return sends;
	}
	
	public void setsendname(String sendname){
		this.sendname = sendname;
	}
	
	public String getsendname(){
		return sendname;
	}
	
	public void setdotime(String dotime){
		this.dotime = dotime;
	}
	
	public String getdotime(){
		return dotime;
	}
	
	public void setdoname(String doname){
		this.doname = doname;
	}
	
	public String getdoname(){
		return doname;
	}
	
	public void setsettlement(String settlement){
		this.settlement = settlement;
	}
	
	public String getsettlement(){
		return settlement;
	}
	
	public void setbeizhu(String beizhu){
		this.beizhu = beizhu;
	}
	
	public String getbeizhu(){
		return beizhu;
	}

}
