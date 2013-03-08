#include "FileOperate.h"
#include <fstream>
#include <cstring>
#include <iostream>


#ifndef _FILETEST_H
#define _FILETEST_H
#endif


using namespace std;

/**
 *读取文件  在cydwin里面可以加上eg:/cygdrive/f/cFile.txt
 *读取文件  也可以直接写成F:/cFile.txt  只不过有提示
 */
const char* FileOpear::read(const char * fileName) {
	//int size=51200;
	//
	//str.assign(fileName);
	cout << "readfileName" << fileName << endl;
	if (strlen(fileName) < 1) {
		cout << "fileName is null" << endl;
		return "fileName is null";
	}

	ifstream file;
	file.open(fileName/*"/cygdrive/f/cFile.txt"*/);
	if (!file) {
		cout << "file is noExist" << endl;
		return "file is noExist";
	}
	if (file.eof()) {
		cout << "file is empty." << endl;
		return "file is empty";
	}
	string str;
	char ch;
	while (!file.eof()) {
		file.get(ch);
		str += ch;
		//cout << ch;
	}
	//str.clear();

	return str.c_str();
}
;
/**
 * 写入文件
 */
const char* FileOpear::write(const char*fileName, const char*content) {
	cout << "fileName" << fileName << endl;
	if (strlen(fileName) < 1) {
		cout << "文件名字不合法" << fileName << endl;
		return NULL;
	}
	ofstream file(fileName);//这样构造函数写 是因为当file不存在时候就创建他
	//
	//file.open(fileName, ios::in);
	/*if (file) {
		cout << "文件open 失败" << fileName << endl;
		return NULL;
	}*/
	//cout << "content" << content << endl;
	//file.write(content, strlen(content));
	file<<content;
	file.flush();
	file.close();
	file.clear();
	cout << "写入文件成功" << endl;
	return fileName;
}
