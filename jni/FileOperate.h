#ifndef _Included_com_brunjoy_jni_JNINet
#define _Included_com_brunjoy_jni_JNINet
#ifdef __cplusplus
extern "C" {
#endif
class FileOpear {
public:
	const char* read(const char* fileName);
	const char* write(const char* fileName,const char* content);
};
