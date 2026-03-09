package ch04_class;

public class ProductMain02 {
    static void main(String[] args) {
        Product02.brand = "농심";

        Product02 shin = new Product02();

        Product02 blackbean = new Product02();

        shin.setName("신라면");// 간접쓰기
        shin.setPrice(1000);// 간접쓰기
        shin.inputdate = "2026/03/01"; //직접쓰기

 //     Product02.brand = "농심";
   //     Product02 shin = new Product02();
        System.out.println(shin.brand); // "농심"

        shin.brand ="nongsim";

        System.out.println(blackbean.brand);

        System.out.println("상품명: "+shin.getName());
        System.out.println("단가: "+shin.getPrice());
        System.out.println("입고일자: "+shin.inputdate);

    }
}
