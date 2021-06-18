struct Reading {
	DateTime time;
	int value;
};
Reading r1 = Gauge.Read();
Thread.Sleep(5000);

Reading r1 = Gauge.Read();
Thread.Sleep(5000);

Reading r3 = Gauge.Read();
Thread.Sleep(5000);

Reading[] readings = new Reading[5];
reading[0] = Gauge.Read();
reading[1] = Gauge.Read();

Reading r = readings[2];

for (int i=0; i<5;i++) {
	Reading r = readings[i];
}












