package com.nic.sqlitedemo;

public class Contact {
    int  _Id;
    String _name;
    String _Phone_no;



    public Contact(){   }
    public Contact(int id, String name, String _phone_number){
        this._Id = id;
        this._name = name;
        this._Phone_no = _phone_number;
    }

    public Contact(String name, String _phone_number){
        this._name = name;
        this._Phone_no = _phone_number;
    }

    public int get_Id() {
        return _Id;
    }

    public void set_Id(int _Id) {
        this._Id = _Id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_Phone_no() {
        return _Phone_no;
    }

    public void set_Phone_no(String _Phone_no) {
        this._Phone_no = _Phone_no;
    }
}
