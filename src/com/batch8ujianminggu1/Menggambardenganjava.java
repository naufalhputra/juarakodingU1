package com.batch8ujianminggu1;

import java.util.Scanner;

public class Menggambardenganjava {
	
	
		private String jenisGambar = "";
	    private String hasilGambar;


	    public String getJenisGambar() {
	        return jenisGambar;
	    }
	    public void setJenisGambar(String jenisGambar) {
	        this.jenisGambar = jenisGambar;
	    }


	    public void gambarKotak (String kotak) {
	        this.jenisGambar = kotak;
	        Scanner scan = new Scanner(System.in);
			
		 	System.out.print("Masukkan panjang: ");
	        int panjang = scan.nextInt();
	        System.out.print("Masukkan lebar : ");
	        int lebar = scan.nextInt();

		  int i, j;
		  for (i=0; i<panjang; i++) {
		   for (j=0; j<lebar ; j++) {
		  
		    System.out.print("*"); 
		   }
		   System.out.println();
		  }
		  
	    }

	    public void gambarsegitiga (String segitiga) {
	        this.jenisGambar = segitiga;
	        Scanner scan = new Scanner(System.in);
			
		 	System.out.print("Masukkan tinggi: ");
		 	int panjang = scan.nextInt();
	        
	        int i, j;

	        for (i = 0; i < panjang; i++) {
	        for (j = 0; j <= i; j++) {

	        System.out.print("*");
	        }
	        System.out.println();
	        }    
	       
	    }
    
	    public void gambarsegitigaterbalik (String segitigaterbalik) {
	        this.jenisGambar = segitigaterbalik;
	      
	        Scanner scan = new Scanner(System.in);
			
		 	System.out.print("Masukkan tinggi: ");
	        int panjang = scan.nextInt();

	        int i, j;

	        for (i = 0; i <= panjang; i++) {
	        for (j = i; j < panjang; j++) {

	        System.out.print("*");
	        }
	        System.out.println();
	        }  
	    }
	    
	    public void gambarselangseling (String selangseling) {
	        this.jenisGambar = selangseling;
	        
	        Scanner scan = new Scanner(System.in);
			
		 	System.out.print("Masukkan tinggi: ");
	        int panjang = scan.nextInt();
	        int nilai = 0;

	        for (int x = 0; x <= panjang; x++) {
	            for(int y = x; y < panjang; y++) {
	                nilai++;
	                if (nilai % 2 == 0) {
	                    System.out.print("!");
	                }else {
	                    System.out.print("*");
	                }
	            }
	            System.out.println("");
	        }	   
	      }
	      
	    public void gambarcampur (String campur) {

	        this.jenisGambar = campur;
	        
	        Scanner scan = new Scanner(System.in);
	        
	     	System.out.print("Masukkan tinggi: ");
	        int panjang = scan.nextInt();
	        
	        for (int x = 0; x < panjang; x++) {
				for (int y = 0; y <= panjang; y++) {
					
					
					if(y <= x) {
		    			System.out.print("*");
		    		}else {
		    			System.out.print("!");
		            }
		    	  }
		    	        System.out.println("");
			
			}
	        
	    }
	   
	    public void gambargabung (String gabung) {
	        this.jenisGambar = gabung;

	        Scanner scan = new Scanner(System.in);
	        
	     	System.out.print("Masukkan tinggi: ");
	        int panjang = scan.nextInt();
	        int nilai = 0;

	        for (int x = 0; x < panjang; x++) {
				for (int y = 0; y <= panjang; y++) {
					
	                
					if( y <= x) {
		    			System.out.print("*");
		    		}else {
		    			System.out.print("#");
		    		}
					}
			        System.out.println("");
	        }
	        	for(int x = 0; x <= panjang; x++){
	        		for (int y = x; y < panjang; y++) {
	        			nilai++;
	        				if (nilai % 2 == 0) {
	        					System.out.print("!");
	        				}else {
	        					System.out.print("*");
	        				}
	        				}
	        					System.out.println("");
		        }
	        		
	        		
	       	} 
	        	
	        	
		
			
	    
	    

	    public void hasil() {
	        System.out.println("Berikut adalah gambar " + this.jenisGambar + ".");
	    }

}



