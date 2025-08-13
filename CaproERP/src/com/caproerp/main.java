/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.caproerp;

import com.caproerp.branch.Dto.BranchDto;

import com.caproerp.branch.Dto.ProductDto;
/**
 *
 * @author PNG
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main_1 main =new Main_1();
        main.setVisible(true);
        BranchDto.getBranchList();
          ProductDto.getProductList().forEach(product -> {
            System.out.println(product.getProductName());
        });
          
    }
    
}
