import java.util.Scanner;
import java.io.*;
import java.nio.*;
/*

 */

public class version {
    public static void main(String[] args) {
        String ruaCCS_Covenant = "zh_cn";
        String ruaU_ruby = "en";
        Main_operation op = new Main_operation();
        tips ruaaaaa = new tips();
        processDef def = new processDef();

        ruaaaaa.SelLanguage();
        Scanner scan = new Scanner(System.in);
        String language = scan.nextLine();
        int language_id = def.language(language);
        ruaaaaa.keyInType_en();
        ruaaaaa.keyInType_zh_cn();

        String type = scan.nextLine();
        int damage = scan.nextInt();
        int DefenceBreak = scan.nextInt();
        int accuary = scan.nextInt();
        int fill = scan.nextInt();
        int force = scan.nextInt();
        int miss = scan.nextInt();
        int amount = scan.nextInt();
        scan.close();

        switch (language_id){
            case 0:{
                int data = 0;
                String Fallen = ".\\language_pack\\All\\illegal_Language.pack";
                try{
                    FileReader file = new FileReader(Fallen);
                    while ((data=file.read())!=-1) {
                        System.out.print((char)data);
                    }
                    file.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }finally {}
                System.exit(0);
                break;
            }
            case 1:{
                op.en_main(type,damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 2:{
                op.cn_main(type,damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
        }
        Scanner r = new Scanner(System.in);
    }
}

class processDef {
    static String type_1 = "bgm71";
    static String type_2 = "2b14";
    static String type_3 = "at4";
    static String type_4 = "ags30";
    static String type_5 = "m2";
    static String type_6 = "mk153";
    static String type_7 = "pp93";
    String lan_zh = "zh_cn";
    String lan_en = "en";

    public int def_type(String type) {
        if (type.equals(processDef.type_1)) return 1;
        else if (type.equals(processDef.type_2)) return 2;
        else if (type.equals(processDef.type_3)) return 3;
        else if (type.equals(processDef.type_4)) return 4;
        else if (type.equals(processDef.type_5)) return 5;
        else if (type.equals(processDef.type_6)) return 6;
        else if (type.equals(processDef.type_7)) return 7;
        else return 0;
    }

    public double miss(int accuray,int miss) {
        return ((double)accuray/((double)accuray+8*(double)miss));
    }

    public double shotspeed(int fill) {
        return (Math.floor(1500/Math.ceil((300+(double)fill)/30))/30);
    }

    public void ifIllegal(){

    }

    public int language(String language){
        if (language.equals(lan_en)) return 1;
        else if (language.equals(lan_zh)) return 2;
        else return 0;
    }
}

class warns{
    public void TypeError_zh_cn() {
        int data = 0;
        String filepath = ".\\src\\language_pack\\zh_cn_TypeError.pack";
        try{FileReader file = new FileReader(filepath);
            while ((data = file.read())!=-1) {
                System.out.print((char)data);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
        }
    }

    public void TypeError_en(){
        int data = 0;
        String filepath = ".\\src\\language_pack\\en_TypeError.pack";
        try{
            FileReader file = new FileReader(filepath);
            while ((data = file.read())!=-1) {
                System.out.print((char)data);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}

class tips{
    public void keyInType_zh_cn(){
        int data = 0;
        String filepath = ".\\src\\language_pack\\zh_cn_text.pack";
        try {
            FileReader file = new FileReader(filepath);
            while ((data=file.read())!=-1) {
                System.out.print((char)data);
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{

        }
    }

    public void keyInType_en(){
        int data = 0;
        String filepath = ".\\src\\language_pack\\en_text.pack";
        try {
            FileReader file = new FileReader(filepath);
            while((data=file.read())!=-1) {
                System.out.print((char)data);
            }
            file.close();
        }catch (IOException e) {
            e.printStackTrace();
        } finally{}
    }

    public void SelLanguage(){
        int ruaAutumn = 0;
        String filepath = ".\\src\\language_pack\\ALL\\languageSelect.package";
        try{
            FileReader file = new FileReader(filepath);
            while ((ruaAutumn=file.read())!=-1) {
                System.out.print((char)ruaAutumn);
            }
            file.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {

        }
    }
}

class Main_operation{
    public void en_main(String type,int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount){
        processDef def = new processDef();
        warns warn = new warns();
        tips tip = new tips();
        calculate method_114 = new calculate();
        double dps = 0;

        switch (def.def_type(type)){
            case 0:{
                warn.TypeError_en();
                System.exit(0);
                break;
            }
            case 1:{
                dps = method_114.bgm71(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 2:{
                dps = method_114._2b14(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 3:{
                dps = method_114.at4(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 4:{
                dps = method_114.ags30(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 5:{
                dps = method_114.m2(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 6:{
                dps = method_114.mk153(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 7:{
                //has not been finished
                break;
            }
        }
        System.out.printf("\nDPS is %.10f\n",dps);
    }
    public void cn_main(String type,int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount){
        processDef def = new processDef();
        warns warn = new warns();
        tips tip = new tips();
        calculate method_114 = new calculate();
        double dps = 0;

        switch (def.def_type(type)){
            case 0:{
                warn.TypeError_zh_cn();
                System.exit(0);
                break;
            }
            case 1:{
                dps = method_114.bgm71(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 2:{
                dps = method_114._2b14(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 3:{
                dps = method_114.at4(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 4:{
                dps = method_114.ags30(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 5:{
                dps = method_114.m2(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 6:{
                dps = method_114.mk153(damage,DefenceBreak,accuary,fill,force,miss,amount);
                break;
            }
            case 7:{
                //has not been finished
                break;
            }
        }
        System.out.printf("\nDPS is %.10f\n",dps);
    }
}

class calculate{
    public double bgm71(int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount){
        processDef def = new processDef();
        double MissDef = def.miss(accuary, miss);
        double shotspeed = def.shotspeed(fill);
        totalCalculation_bgm71 cal = new totalCalculation_bgm71();
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damage,DefenceBreak,MissDef,amount,Times_onBreak);
        double dps = totalEcptBreak / ((double)(Times_totalBreak+5000)*shotspeed);
        return dps;
    }

    public double _2b14(int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount) {
        processDef def = new processDef();
        double MissDef = def.miss(accuary, miss);
        double shotspeed = def.shotspeed(fill);
        totalCalculation_2b14 cal = new totalCalculation_2b14();
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
        double dps = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, amount, Times_onBreak, shotspeed) / (((double)(5000+Times_totalBreak))*shotspeed);
        return dps;
    }

    public double at4(int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount) {
        processDef def = new processDef();
        double MissDef = def.miss(accuary, miss);
        double shotspeed = def.shotspeed(fill);
        totalCalculation_at4 cal = new totalCalculation_at4();
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, Times_onBreak, amount, shotspeed);
        double dps = totalEcptBreak / (shotspeed*(double)(5000+Times_totalBreak));
        return dps;
    }

    public double ags30(int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount) {
        processDef def = new processDef();
        int accuaryT = (int)(Math.ceil((double)accuary*1.3));
        int damageT = (int)(Math.ceil((double)damage/3));
        int DefenceBreakT = (int)(Math.ceil((double)DefenceBreak/3));
        double MissDef = def.miss(accuaryT, miss);
        double shotspeed = def.shotspeed(fill);
        totalCalculation_ags30 cal = new totalCalculation_ags30();
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreakT, MissDef, shotspeed)[1];
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreakT, MissDef, shotspeed)[0];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damageT, DefenceBreak, MissDef, Times_onBreak, amount, shotspeed);
        double dps = totalEcptBreak / (shotspeed*(double)(1250+Times_totalBreak));
        return dps;
    }

    public double m2(int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount) {
        processDef def = new processDef();
        double shotspeed = def.shotspeed(fill);
        totalCalculation_m2 cal = new totalCalculation_m2();
        int def_force_E = cal.def_force_E(force);
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, accuary,miss)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, accuary,miss)[1];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, accuary, Times_onBreak, amount, def_force_E, miss);
        double dps = totalEcptBreak / (shotspeed*(double)(5000+Times_totalBreak));
        return dps;
    }

    public double mk153(int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount) {
        processDef def = new processDef();
        totalCalculation_mk153 cal = new totalCalculation_mk153();
        double shotspeed = def.shotspeed(fill);
        int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[0];
        int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[1];
        int hit_tryShot = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[3];
        int extraDamage = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[4];
        double totalEcptBreak = cal.AttackDamage_afterBreak(damage, accuary, miss, shotspeed, amount, Times_onBreak, DefenceBreak, extraDamage, hit_tryShot);
        double dps = totalEcptBreak / shotspeed*(double)(5000+Times_totalBreak);
        return dps;
    }

    public double pp93(int damage,int DefenceBreak,int accuary,int fill,int force,int miss,int amount) {
        //has not been finished
        return 0;
    }
}

class totalCalculation_bgm71{
    public int[] DefenceBreak(int force,int DefenceBreak,double MissDef) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        for (int CurForce = force;CurForce>0;i++) {
            if (i%2!=0||i==1) {
                if (Math.max(0.4,MissDef)>=Math.random()) {
                    CurForce -= 1.6*DefenceBreak;
                    j++;
                }
            }
            else {
                if (Math.max(0.4,MissDef)>=Math.random()) {
                    CurForce -= DefenceBreak;
                    j++;
                }
            }
        }
        result[0]=i-1;
        result[1]=j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage,int DefenceBreak,double MissDef,int amount,int Times_onBreak) {
        double totalEcptBreak = 0;
        for (int i = 1;i<=5000;i++) {
            if(i%2!=0||i==1) {
                if (Math.max(0.4,MissDef)>=Math.random()) totalEcptBreak=totalEcptBreak+(double)amount*((double)damage*1.8*1.5+0.1*(double)DefenceBreak);
            }
            else {
                if (Math.max(0.4,MissDef)>=Math.random()) totalEcptBreak=totalEcptBreak+(double)amount*((double)damage*1.5+0.1*(double)DefenceBreak);
            }
        }
        totalEcptBreak = totalEcptBreak + (double)(Times_onBreak*amount*damage*1.6);
        return totalEcptBreak;
    }

}

class totalCalculation_2b14{
    public int[] DefenceBreak(int force,int DefenceBreak,double MissDef) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        for (int CurForce = force;CurForce>0;i++) {
            if (Math.max(0.4,MissDef)>=Math.random()) {
                CurForce -= DefenceBreak;
                j++;
            }
        }
        result[0] = i-1;
        result[1] = j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage,int DefenceBreak,double MissDef,int amount,int Times_onBreak,double shotspeed) {
        double totalEcptBreak = 0;
        int timesSkill_2 = 0;

        for (double timeTrigger = 0;timeTrigger<=(4999*shotspeed);timeTrigger += 10) {
            if (Math.max(0.4,MissDef)>=Math.random()) timesSkill_2++;
        }

        for (int i = 1;i<=5000;i++) {
            if (Math.max(0.4,MissDef)>=Math.random()) totalEcptBreak = totalEcptBreak+damage*amount*1.25;
        }

        totalEcptBreak = totalEcptBreak + (double)(timesSkill_2*1.8*damage*1.25*amount) + (double)(Times_onBreak*amount*damage);
        return totalEcptBreak;
    }
}

class totalCalculation_at4{
    public int[] DefenceBreak(int force,int DefenceBreak,double MissDef) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        for (int CurForce = force;CurForce>0;i++) {
            if (Math.max(0.4,MissDef)>=Math.random()) {
                CurForce -= DefenceBreak;
                j++;
            }
        }
        result[0] = i-1;
        result[1] = j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage,int DefenceBreak,double MissDef,int Times_onBreak,int amount,double shotspeed) {
        double totalEcptBreak = 0;
        int timesBurn = 0;
        double timeTrigger = 5/shotspeed;
        for (int i = 1;i<=5000;i++) {
            if (Math.max(0.4,MissDef)>=Math.random()) {
                totalEcptBreak = totalEcptBreak+(double)((damage+DefenceBreak*0.1)*amount);
            }
            if (Math.floor((double)i%timeTrigger)==0) timesBurn++;
        }
        totalEcptBreak = totalEcptBreak+(double)(timesBurn*2*amount*(damage+0.1*DefenceBreak))+(double)(Times_onBreak*damage*amount);
        return totalEcptBreak;
    }
}

class totalCalculation_ags30{
    public int[] DefenceBreak(int force,int DefenceBreak,double MissDef,double shotspeed) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        double timeTrigger = 6/shotspeed;
        for (int CurForce = force;CurForce>0;i+=3) {
            for (int k = 0;k<3;k++) {
                if (Math.max(0.4,MissDef)>=Math.random()) {
                    CurForce -= DefenceBreak;
                    j++;
                }
                if (Math.floor((double)i%timeTrigger)==0) {
                    if (0.4>Math.random()) CurForce -= DefenceBreak*1.2;
                }
            }
        }
        result[0]=i;
        result[1]=j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage,int DefenceBreak,double MissDef,int Times_onBreak,int amount,double shotspeed) {
        double totalEcptBreak = 0;
        for (int i = 1;i<=1250;i++) {
            for (int j = 0;j<4;j++) {
                switch (j) {
                    case 1:
                    case 2:
                    case 3: {
                        if (Math.max(0.4,MissDef)>=Math.random()) totalEcptBreak += (double)(damage*amount);
                        break;
                    }
                    case 4: {
                        if (Math.max(0.4,MissDef)>=Math.random()) totalEcptBreak += (double)(damage*amount*2.2);
                        break;
                    }
                }
            }
        }
        totalEcptBreak = totalEcptBreak+(double)(Times_onBreak*damage*amount);
        return totalEcptBreak;
    }
}

class totalCalculation_m2{
    public int def_force_E(int force) {
        if (force>0) return 1;
        else return 0;
    }

    public int[] DefenceBreak(int force,int DefenceBreak,int accuary,int miss){
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        double tmp_accuary = (double)accuary;

        for(int CurForce = force;CurForce>0;i++) {
            if (i==1) tmp_accuary *= 1.1;
            else if (i==2) tmp_accuary *= 1.1;
            else if (i==3) tmp_accuary *= 1.1;
            else continue;
            double MissDef = ((double)tmp_accuary/(double)(tmp_accuary + 8*miss));
            if (Math.max(0.4,MissDef)>=Math.random()) {
                CurForce -= DefenceBreak;
                j++;
            }
        }
        result[0] = i-1;
        result[1] = j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage,int DefenceBreak,double accuary,int Times_onBreak,int amount,int def_force_E,int miss) {
        double totalEcptBreak = 0;
        double MissDef,damage_skill,tmp_accuary;
        tmp_accuary = (double)accuary;
        damage_skill = (double)damage*1.2;
        switch (def_force_E) {
            case 0:{
                for (int i = 1;i<=5000;i++) {
                    if (i==1) tmp_accuary *= 1.1;
                    else if (i==2) tmp_accuary *= 1.1;
                    else if (i==3) tmp_accuary *= 1.1;
                    else continue;
                    MissDef = ((double)tmp_accuary/(double)(tmp_accuary + 8*miss));
                    if (Math.max(0.4,MissDef)>=Math.random()) {
                        if (i%3==0) totalEcptBreak = totalEcptBreak + damage_skill*amount;
                        else totalEcptBreak = totalEcptBreak + damage*amount;
                    }
                }
                break;
            }
            case 1:{
                for (int i = 1;i<=5000;i++) {
                    MissDef = ((double)tmp_accuary/(double)(tmp_accuary + 8*miss));
                    if (Math.max(0.4,MissDef)>=Math.random()) {
                        if (i%3==0) totalEcptBreak = totalEcptBreak + damage_skill*amount;
                        else totalEcptBreak = totalEcptBreak + damage*amount;
                    }
                }
                break;
            }
        }
        totalEcptBreak = totalEcptBreak+(double)(Times_onBreak*damage*amount);
        return totalEcptBreak;
    }
}

class totalCalculation_mk153{
    public int[] DefenceBreak(int force,int DefenceBreak,int miss,int accuary,int damage,int amount) {
        int[] result = new int[5];
        int i = 1;
        int j = 0;
        int total_tryShot = 0;
        int hit_tryShot = 0;
        int CurForce = force;
        double skill_extraDamage = 0;
        int skill_defTimes = 0;
        int skill_addedDamageTimes = 0;
        double curMiss = (double)miss;
        if (Math.max(0.4,(double)(accuary)/(double)(curMiss*8+accuary))>=Math.random()) {
            curMiss /=0.8;
            total_tryShot++;
            hit_tryShot++;
            skill_defTimes++;
        }
        else total_tryShot++;
        if (Math.max(0.4,(double)(accuary)/(double)(curMiss*8+accuary))>=Math.random()) {
            i++;
            j++;
            CurForce -= DefenceBreak;
            skill_extraDamage = (double)damage;
        }
        else i++;
        for (CurForce = CurForce - 0;CurForce>0;i++) {
            if (Math.max(0.4,(double)(accuary)/(double)(curMiss*8+accuary))>=Math.random()) {
                if (skill_defTimes <=3) {
                    curMiss /= 0.8;
                }
                total_tryShot++;
                hit_tryShot++;
                skill_defTimes++;
            }
            else total_tryShot++;
            if (Math.max(0.4,(double)(accuary)/(double)(curMiss*8+accuary))>=Math.random()) {
                j++;
                skill_addedDamageTimes++;
            }
        }
        int a = (int)Math.ceil(skill_extraDamage+(double)(skill_addedDamageTimes*0.15*damage*amount));
        result[0] = i-1;
        result[1] = j;
        result[2] = total_tryShot;
        result[3] = hit_tryShot;
        result[4] = a;
        return result;
    }

    public double AttackDamage_afterBreak(int damage,int accuary,int miss,double shotspeed,int amount,int Times_onBreak,int DefenceBreak,int extraDamage,int hit_tryShot) {
        double totalEcptBreak = 0;
        double curMiss = (double)miss;
        int skill_defTimes = 0;
        for (int i = 1;i<=5000;i++) {
            if (Math.max(0.4,(double)(accuary)/(double)(curMiss*8+accuary))>=Math.random()) {
                if (skill_defTimes<=2) {
                    skill_defTimes++;
                    curMiss /=0.8;
                }
                else {
                    curMiss *= 1.25;
                    skill_defTimes--;
                }
                totalEcptBreak = totalEcptBreak+(double)damage;
            }
            if (Math.max(0.4,(double)(accuary)/(double)(curMiss*8+accuary))>=Math.random()) totalEcptBreak = totalEcptBreak+(double)(damage+0.1*DefenceBreak)*amount;
        }
        totalEcptBreak = totalEcptBreak+(double)extraDamage+(double)(hit_tryShot*damage)+(double)(Times_onBreak*amount*damage);
        return totalEcptBreak;
    }
}

class totalCalculation_pp93{
    //has not been finished(for some data are still unknown)
}