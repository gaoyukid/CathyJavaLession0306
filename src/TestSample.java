
//java simple case
public class TestSample {
//将一个类声明成public，则也要将文件名取成和这个类一样的名称
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//主方法，程序开始运行的起点
		int no;
		no=7;
		System.out.println("this is number"+no);
		System.out.println("I have "+no+" books");
        //"+" 连接变量
		//println 输出换行
		
    	int x;
		for(x=0;x<3;x++){
			System.out.print(x+"*"+x );//输出不换行
			System.out.println("="+x*x );			
		
		}
	}

}
