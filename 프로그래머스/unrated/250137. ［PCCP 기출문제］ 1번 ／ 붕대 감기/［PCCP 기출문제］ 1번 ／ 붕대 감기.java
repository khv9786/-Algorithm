class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int time = 0;
        int idx = 0;
        int combo = 0;
        int heal = bandage[1];
        int health_max = health;
        
        while(idx < attacks.length){
           
            int att_time = attacks[idx][0];
            int att_damage = attacks[idx][1];
            
            if(time == att_time){
                health -= att_damage;
                combo = 0;
                idx ++;
            }else{
                 health += heal;
                combo ++;
            }
            
            if( combo == bandage[0]){
                combo = 0;
                health += bandage[2];
            }
            
            if(health > health_max){
                health = health_max;
            }
            
            if(health <= 0){
                health = -1;
                break;
            }
            
            time ++;
            
        }
        
        return health;
    }
}