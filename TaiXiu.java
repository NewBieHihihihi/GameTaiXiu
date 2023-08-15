import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		double tk = 500000;
	    Scanner sc = new Scanner(System.in);
	    int choice;
	    do
	    {
	    	System.out.println("Chọn 1 để tiếp tục chơi.");
	    	System.out.println("Chọn 2 để nạp tiền.");
	    	System.out.println("Nhấn phím bất kỳ để thoát");
	    	System.out.print("Chọn: ");
	    	choice = sc.nextInt();
	    	if(choice == 1)
	    	{
	    		System.out.println("----BẮT ĐẦU CHƠI----");
	    		//Đặt cược
	    		System.out.println("Tài Khoản Của Bạn Có: " + tk);
	    		double datcuoc;
	    		do
	    		{
	    			System.out.print("Bạn Muốn Đặt Cược: ");
	    			datcuoc = sc.nextDouble();
	    		}while(datcuoc <= 0 || datcuoc > tk);
	    		//Chọn Tài Hoặc Xỉu
	    		int tai = 1;
	    		int xiu = 2;
	    		int chontx;
	    		do {
	    			System.out.println("Chọn 1 là Tài Hoặc 2 là Xỉu: ");
	    			System.out.print("Chọn 1 Hoặc 2: ");
	    			chontx  = sc.nextInt();
				} while (chontx < 1 && chontx > 2);
	    		//Rung xúc xắc
	    		int sum = 0;
	    		Random random = new Random(System.currentTimeMillis());
	    		int xx1_min = 1,xx1_max = 6;
	    		int xx1 = random.nextInt(xx1_max - xx1_min + 1) + xx1_min;
	    		int xx2 = random.nextInt(xx1_max - xx1_min + 1) + xx1_min;
	    		int xx3 = random.nextInt(xx1_max - xx1_min + 1) + xx1_min;
	    		System.out.println("Xúc Xắc 1 Được: " + xx1);
	    		System.out.println("Xúc Xắc 2 Được: " + xx2);
	    		System.out.println("Xúc Xắc 3 Được: " + xx3);
	    		sum = xx1 + xx2 + xx3;
	    		if(sum == 3 || sum == 18)
	    		{
	    			System.out.println("Bạn Đã Thua! Cái Ăn Hết");
	    			tk = tk - datcuoc ;
	    			System.out.println("Tài Khoản Bạn Còn: " + tk);
	    		}
	    		else if(sum >= 4 && sum <= 10)
	    		{
	    				if(chontx == 2)
	    				{
	    					System.out.println("Bạn Đã Trúng Xỉu.");
	    					tk = tk + datcuoc;
	    					System.out.println("Tài Khoản Bạn Được: " + tk);
	    				}
	    				else
	    				{
	    					System.out.println("Bạn Thua Bạn Đã Chọn Tài");
	    					tk = tk - datcuoc;
	    					System.out.println("Tài Khoản Bạn Còn: " + tk);
	    				}
	    		}
	    		else
	    		{
	    			if(chontx == 1)
	    			{
	    				System.out.println("Bạn Đã Trúng Tài");
    					tk = tk + datcuoc;
    					System.out.println("Tài Khoản Bạn Được: " + tk);
	    			}
	    			else
    				{
    					System.out.println("Bạn Thua Bạn Đã Chọn Xỉu");
    					tk = tk - datcuoc;
    					System.out.println("Tài Khoản Bạn Còn: " + tk);
    				}
	    		}
	    		}
	    	else if(choice == 2)
	    	{
	    		System.out.println("Nhập Số Tiền Bạn Muốn Nạp:" );
	    		double nap = sc.nextDouble();
	    		tk = tk + nap;
	    		System.out.println("Tài Khoản Sau Khi Nạp: " + tk);
	    	}
	    	else
	    	{
	    		System.out.println("Exit.6");
	    		break;
	    	}
	    }while(choice == 1 || choice == 2);
	}

}
