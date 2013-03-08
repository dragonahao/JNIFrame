
class net {
private:
	const char*host;
	const char*ip;
	unsigned short port ;

public:
	net();
	void setHost(const char* host);
	const char* getIP(bool newget);
	void setPort(unsigned short port);

	const char*getUrlStr(const char*path,bool isGet);
	const char* receviceByURL( const char*request);
};

