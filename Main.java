import java.io.IOException;
import java.lang.Math;
import java.awt.image.BufferedImage;

//WILL SAVE INTO DRAWN.PNG

public class Main {
    public static void main(String[] args) throws IOException {
        boolean end = true;
        int[][] a = new int[75][75];
        int m=0;

        System.out.println("Do you want a template to start with, a completely white paper, randomly coloured, or from a file(Do not choose this first time, because it would be 0 bytes big)? Enter 1,2,3,4. (default is template) ");
        int version = System.in.read();
        switch(version){
            case '1': version=1; break;
            case '2': version=2; break;
            case '3': version=3; break;
            case '4': version = 4; break;
            default: version = 2;
        }

        while(end) {
            System.out.println("Hello, here you can draw numbers. ");
            System.out.println("choose color, enter their RGB number:");
            System.out.println("r= red. o= orange. y= yellow. l= lightgreen.");
            System.out.println("g= green. s= springgreen. c= cyan. a=azure.");
            System.out.println("b= blue. v=violet. m=magenta. d=rose. w=white. n=black.");
            m = System.in.read();
            switch(m){
                case 'r': m=0xFF0000; end=false; break;
                case 'o': m=0xFF7F00; end=false; break;
                case 'y': m=0xFFFF00; end=false; break;
                case 'l': m=0x7FFF00; end=false; break;
                case 'g': m=0x00FF00; end=false; break;
                case 's': m=0x00FFF0; end=false; break;
                case 'c': m=0x00FFFF; end=false; break;
                case 'a': m=0x07F0FF; end=false; break;
                case 'b': m=0x0000FF; end=false; break;
                case 'v': m=0x7F00FF; end=false; break;
                case 'm': m=0xFF00FF; end=false; break;
                case 'd': m=0xFF007F; end=false; break;
                case 'n': m=0x000000; end=false; break;
                case 'w': m=0xFFFFFF; end=false; break;
                default: System.out.println(" \n \n CHOOSE ONE OF THE OPTIONS \n ");
            }
        }

        if(version ==1){
            for(int x = 0; x < a.length; x++){
                for( int y = 0; y< a[0].length; y++){
                    if(x==40 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==27 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==51){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==51){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==51){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==52){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==52){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==58 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==58 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==58 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==59 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==59 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==58 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==31){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==58 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==24){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==24){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==23){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==23){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==24){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==23){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==22){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==22){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==22){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==58 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==36){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==38){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==19){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==19){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==20){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==20){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==21){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==21){a[x][y]=0xFFFF00;}
                    else if(x==50 && y ==22){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==21){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==29){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==30){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==28){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==26){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==27){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==24){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==23){a[x][y]=0xFFFF00;}
                    else if(x==49 && y ==22){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==21){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==20){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==20){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==35 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==34 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==31 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==30 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==27 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==27 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==26 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==27 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==26 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==47){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==51 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==52 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==53 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==41){a[x][y]=0xFFFF00;}
                    else if(x==54 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==40){a[x][y]=0xFFFF00;}
                    else if(x==55 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==56 && y ==39){a[x][y]=0xFFFF00;}
                    else if(x==57 && y ==37){a[x][y]=0xFFFF00;}
                    else if(x==33 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==42){a[x][y]=0xFFFF00;}
                    else if(x==32 && y ==43){a[x][y]=0xFFFF00;}
                    else if(x==36 && y ==44){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==45){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==46){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==47 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==48 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==42 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==38 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==39 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==48){a[x][y]=0xFFFF00;}
                    else if(x==41 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==40 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==19){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==19){a[x][y]=0xFFFF00;}
                    else if(x==46 && y ==18){a[x][y]=0xFFFF00;}
                    else if(x==44 && y ==19){a[x][y]=0xFFFF00;}
                    else if(x==45 && y ==18){a[x][y]=0xFFFF00;}
                    else if(x==43 && y ==19){a[x][y]=0xFFFF00;}
                    else if(x==27 && y ==51){a[x][y]=0xFFFF00;}
                    else if(x==26 && y ==51){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==50){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==49){a[x][y]=0xFFFF00;}
                    else if(x==37 && y ==25){a[x][y]=0xFFFF00;}
                    else if(x==27 && y ==32){a[x][y]=0xFFFF00;}
                    else if(x==26 && y ==33){a[x][y]=0xFFFF00;}
                    else if(x==27 && y ==34){a[x][y]=0xFFFF00;}
                    else if(x==28 && y ==35){a[x][y]=0xFFFF00;}
                    else if(x==29 && y ==36){a[x][y]=0xFFFF00;}

//else{  a[x][y]= (int)(Math.random() * 0xFFFFFF);}
                    else{a[x][y] = 0xFF0000;}}


                //   else{  a[x][y]= (int)(Math.random() * 0xFFFFFF);}
            }
        }
        if(version ==3){
            for(int k = 0; k < a.length; k++){
                for( int j = 0; j< a[0].length; j++){
                    a[k][j]= (int)(Math.random() * 0xFFFFFF);
                }}
        }

        if(version ==2){
            for(int k = 0; k < a.length; k++){
                for( int j = 0; j< a[0].length; j++){
                    a[k][j]=0xFFFFFF;
                }}

        }

        if(version == 4){
            a = IntoFile.loadImage("drawn.png");
        }

        Img img = new Img(a, m);

        img.display();

    }
}
