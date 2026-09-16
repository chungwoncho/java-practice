package com.survivalcoding;

public class cleric {
    // 필드(field), 멤버변수(member variable), 속성(property), 전역변수
    string name;
    int hp;
    int mp;
    final int max_hp = 50;
    final int min_mp = 10;
}

void selfaid() {
    if (mp - 5 != 0) {
        hp = max_hp
        }
}

int pray(int sec) {
    while (sec > 0) {
        mp = mp + (int) (Math.random() * 3); // 0, 1, 2 중 하나
        sec--;
    }
    return mp;
}
