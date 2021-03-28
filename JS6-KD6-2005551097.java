class Hewan{	//Abstraction

	//mendeklarasikan nama yang bersifat private
	private String nama;	//Encapsulation
    //mendeklarasikan nama yang bersifat public
    public String warna;
    
    //mendeklarasikan function yang bersifat public untuk mengambil data nama yang bersifat private
    public String getNama(){
    return nama;
    }
    
    //mendeklarasikan function yang bersifat public dengan memiliki parameter yang akan menjadi nama baru dari data nama yang bersifat private
    public void setNama(String namaBaru){
    this.nama = namaBaru;
    }
}
//inheritance badak terhadap hewan
class Badak extends Hewan{	//Inheritance
	//function yang mengubah nama hewan menjadi "Badak"
	public void gantiNama(){	//Polymorphism & Encapsulation
    	this.setNama("Badak");
    
    }
    //function yang mengubah warna hewan menjadi "Hitam"
    public void gantiWarna(){	//Polymorphism & Encapsulation
    	this.warna="Hitam";
    }
}

//inheritance elang terhadap hewan
class Elang extends Hewan{	//Inheritance
	//function yang mengubah nama hewan menjadi "Elang"
	public void gantiNama(){	//Polymorphism
    	this.setNama("Elang");
    
    }
    //function yang mengubah warna menjadi "Putih"
    public void gantiWarna(){ 	//Polymorphism
    	this.warna="Putih";
    }
}



public class Main{
	public static void main(String[] args) {
    //Instance
    Badak badak = new Badak();
    Elang elang = new Elang();
    //Pemanggilan function
    badak.gantiNama();
    badak.gantiWarna();
    elang.gantiNama();
    elang.gantiWarna();
    //tampilan akhir
    System.out.println("Nama hewan: " + badak.getNama());
    System.out.println("Warna hewan: " + badak.warna);
    System.out.println("Nama hewan: " + elang.getNama());
    System.out.println("Warna hewan: " + elang.warna);
    
    }

}

