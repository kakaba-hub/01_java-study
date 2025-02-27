package com.kyungbae.section06.uses.run;

import com.kyungbae.section06.uses.controller.MoneyController;
import com.kyungbae.section06.uses.exception.NegativeException;
import com.kyungbae.section06.uses.exception.NegativeMoneyException;
import com.kyungbae.section06.uses.exception.NegativePriceException;
import com.kyungbae.section06.uses.exception.NotEnoughMoneyException;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        MoneyController mc = new MoneyController();
        Scanner sc = new Scanner(System.in);
        System.out.print("상품 가격: ");
        int price = sc.nextInt();
        System.out.print("보유 돈: ");
        int money = sc.nextInt();

        try {
            mc.checkEnoughMoney(price, money);
//        } catch (NegativePriceException | NegativeMoneyException e) {
            // 여러 예외클래스들을 한번에 처리하고자 할 경우 | 사용 가능
        }catch (NegativeException e){ // 공통 부모 예외클래스 생성
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        }

    }
}
