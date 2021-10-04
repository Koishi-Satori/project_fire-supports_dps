import java.util.Scanner;
public class cal_ver4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        tips tip = new tips();
        def def = new def();
        warns warn = new warns();
        tip.SelLanguage();
        String language = scan.nextLine();
        if (language.equals(def.lan_en)==true) {
            tip.KeyInType_en();
            String type = scan.nextLine();
            switch (def.def_type(type)) {
                case 0:warn.TypeError_en();
                case 1:{
                    tip.KeyInAmount_en();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_en();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    double MissDef = def.miss(accuary, miss);
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_bgm71 cal = new totalCalculation_bgm71();
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage,DefenceBreak,MissDef,amount,Times_onBreak);
                    double dps = totalEcptBreak / ((double)(Times_totalBreak+5000)*shotspeed);
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 2:{
                    tip.KeyInAmount_en();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_en();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    double MissDef = def.miss(accuary, miss);
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_2b14 cal = new totalCalculation_2b14();
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
                    double dps = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, amount, Times_onBreak, shotspeed) / (((double)(5000+Times_totalBreak))*shotspeed);
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 3:{
                    tip.KeyInAmount_en();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_en();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    double MissDef = def.miss(accuary, miss);
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_at4 cal = new totalCalculation_at4();
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, Times_onBreak, amount, shotspeed);
                    double dps = totalEcptBreak / (shotspeed*(double)(5000+Times_totalBreak));
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 4:{
                    tip.KeyInAmount_en();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_en();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    accuary *= 1.3;
                    damage /= 3;
                    DefenceBreak /= 3;
                    double MissDef = def.miss(accuary, miss);
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_ags30 cal = new totalCalculation_ags30();
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef, shotspeed)[1];
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef, shotspeed)[0];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, Times_onBreak, amount, shotspeed);
                    double dps = totalEcptBreak / (shotspeed*(double)(1250+Times_totalBreak));
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 5:{
                    tip.KeyInAmount_en();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_en();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_m2 cal = new totalCalculation_m2();
                    int def_force_E = cal.def_force_E(force);
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, accuary,miss)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, accuary,miss)[1];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, accuary, Times_onBreak, amount, def_force_E, miss);
                    double dps = totalEcptBreak / (shotspeed*(double)(5000+Times_totalBreak));
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 6:{
                    tip.KeyInAmount_en();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_en();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    totalCalculation_mk153 cal = new totalCalculation_mk153();
                    double shotspeed = def.shotspeed(fill);
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[1];
                    int hit_tryShot = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[3];
                    int extraDamage = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[4];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage, accuary, miss, shotspeed, amount, Times_onBreak, DefenceBreak, extraDamage, hit_tryShot);
                    double dps = totalEcptBreak / shotspeed*(double)(5000+Times_totalBreak);
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 7:{
                    break;
                }
            }
        }
        else {
            tip.KeyInType_zh_cn();
            String type = scan.nextLine();
            switch (def.def_type(type)) {
                case 0:warn.TypeError_zh_cn();
                case 1:{
                    tip.KeyInAmount_zh_cn();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_zh_cn();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    double MissDef = def.miss(accuary, miss);
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_bgm71 cal = new totalCalculation_bgm71();
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage,DefenceBreak,MissDef,amount,Times_onBreak);
                    double dps = totalEcptBreak / ((double)(Times_totalBreak+5000)*shotspeed);
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 2:{
                    tip.KeyInAmount_zh_cn();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_zh_cn();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    double MissDef = def.miss(accuary, miss);
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_2b14 cal = new totalCalculation_2b14();
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
                    double dps = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, amount, Times_onBreak, shotspeed) / (((double)(5000+Times_totalBreak))*shotspeed);
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 3:{
                    tip.KeyInAmount_zh_cn();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_zh_cn();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    double MissDef = def.miss(accuary, miss);
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_at4 cal = new totalCalculation_at4();
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef)[1];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, Times_onBreak, amount, shotspeed);
                    double dps = totalEcptBreak / (shotspeed*(double)(5000+Times_totalBreak));
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 4:{
                    tip.KeyInAmount_zh_cn();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_zh_cn();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    accuary *= 1.3;
                    damage /= 3;
                    DefenceBreak /= 3;
                    double MissDef = def.miss(accuary, miss);
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_ags30 cal = new totalCalculation_ags30();
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, MissDef, shotspeed)[1];
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, MissDef, shotspeed)[0];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, MissDef, Times_onBreak, amount, shotspeed);
                    double dps = totalEcptBreak / (shotspeed*(double)(1250+Times_totalBreak));
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 5:{
                    tip.KeyInAmount_zh_cn();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_zh_cn();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    double shotspeed = def.shotspeed(fill);
                    totalCalculation_m2 cal = new totalCalculation_m2();
                    int def_force_E = cal.def_force_E(force);
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, accuary,miss)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, accuary,miss)[1];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage, DefenceBreak, accuary, Times_onBreak, amount, def_force_E, miss);
                    double dps = totalEcptBreak / (shotspeed*(double)(5000+Times_totalBreak));
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 6:{
                    tip.KeyInAmount_zh_cn();
                    int damage = scan.nextInt();
                    int DefenceBreak = scan.nextInt();
                    int accuary = scan.nextInt();
                    int fill = scan.nextInt();
                    tip.KeyInEnemy_zh_cn();
                    int miss = scan.nextInt();
                    int force = scan.nextInt();
                    int amount = scan.nextInt();
                    scan.close();
                    totalCalculation_mk153 cal = new totalCalculation_mk153();
                    double shotspeed = def.shotspeed(fill);
                    int Times_totalBreak = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[0];
                    int Times_onBreak = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[1];
                    int hit_tryShot = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[3];
                    int extraDamage = cal.DefenceBreak(force, DefenceBreak, miss, accuary, damage, amount)[4];
                    double totalEcptBreak = cal.AttackDamage_afterBreak(damage, accuary, miss, shotspeed, amount, Times_onBreak, DefenceBreak, extraDamage, hit_tryShot);
                    double dps = totalEcptBreak / shotspeed*(double)(5000+Times_totalBreak);
                    System.out.printf("dps is\t%.10f",dps);
                    break;
                }
                case 7:{
                    break;
                }
            }

        }
    }
}

class def{
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
        if (type.equals(def.type_1)==true) return 1;
        else if (type.equals(def.type_2)==true) return 2;
        else if (type.equals(def.type_3)==true) return 3;
        else if (type.equals(def.type_4)==true) return 4;
        else if (type.equals(def.type_5)==true) return 5;
        else if (type.equals(def.type_6)==true) return 6;
        else if (type.equals(def.type_7)==true) return 7;
        else return 0;
    }

    public double miss(int accuary,int miss) {
        return ((double)accuary/((double)accuary)+8*(double)miss);
    }

    public double shotspeed(int fill) {
        return (Math.floor(1500/Math.ceil((300+(double)fill)/30))/30);
    }
}

class warns{
    public void TypeError_zh_cn() {
        System.out.println("��������ȷ������");
    }

    public void TypeError_en() {
        System.out.println("Please key in correct type.");
    }
}

class tips{
    public void KeyInType_zh_cn() {
        System.out.println("ѡ��һ����װ���ͣ�2b14/bgm71/at4/ags30/m2/mk153��");
    }

    public void KeyInType_en() {
        System.out.println("select the type of fire-support.(2b14/bgm71/at4/ags30/m2/mk153)");
    }

    public void KeyInAmount_zh_cn() {
        System.out.println("��˳�����뼺����ֵ��(ɱ�� �Ʒ� ���� װ�");
    }

    public void KeyInAmount_en() {
        System.out.println("key in our amount in order:(damage defencebreak accuary filling)");
    }

    public void KeyInEnemy_zh_cn() {
        System.out.println("��˳������з���ֵ�������� ���� ���ƣ�");
    }

    public void KeyInEnemy_en() {
        System.out.println("Key in enemy amount in order:(miss force amount)");
    }

    public void SelLanguage() {
        System.out.println("ѡ���������/select your language(zh_cn����/enӢ��)");
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

}