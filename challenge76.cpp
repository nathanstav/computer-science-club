#include <iostream>
#include <string>

using namespace std;

int braceletSale(string str, string design) {
    string temp = "";
    for (int i = 0; i < design.size(); i++) {
        if (str.find(design[i]) == string::npos) {
            return false;
        }
        temp += design[i];
    }

    return true;

}

int main() {
    string beads;
    string design1;
    cin >> beads;
    cin >> design1;

    

}