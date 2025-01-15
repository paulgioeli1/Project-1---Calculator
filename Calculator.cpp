#include <iostream>
using namespace std;


int addemup(int num1, int num2){
    return num1 + num2;
}

int subtractem(int num1, int num2){
    return num1 - num2;
}

int multiplyem(int num1, int num2){
    return num1 * num2;
}

double divdeem(double num1, double num2){
    return num1/num2;
}

int exponentiate(int num1, int num2){
    int result = num1;

    for(int i = 0; i < num2; i++){
        result *= num1;
    }

    return result;
}

int modulo(int num1, int num2){
    return num1 % num2;
}

int main(){
    cout << "wow you did it!" << endl;
    cout << addemup(2, 54) << endl;
    cout << subtractem(54, 54) << endl;
    cout << multiplyem(8, 9) << endl;
    cout << divdeem(99, 22) << endl;
    cout << exponentiate(3, 3) << endl;
    cout << modulo(71, 69) << endl;

}