ʵ��֧�����нӿڵġ��������项- SnapshotArray��

SnapshotArray(int length) - ��ʼ��һ����ָ��������ȵ� ������ �����ݽṹ����ʼʱ��ÿ��Ԫ�ض����� 0��
void set(index, val) - �Ὣָ������ index ����Ԫ������Ϊ val��
int snap() - ��ȡ������Ŀ��գ������ؿ��յı�� snap_id�����պ��ǵ��� snap() ���ܴ�����ȥ 1����
int get(index, snap_id) - ����ָ���� snap_id ѡ����գ������ظÿ���ָ������ index ��ֵ��
 

ʾ����

���룺["SnapshotArray","set","snap","set","get"]
     [[3],[0,5],[],[0,6],[0,0]]
�����[null,null,0,null,5]
���ͣ�
SnapshotArray snapshotArr = new SnapshotArray(3); // ��ʼ��һ������Ϊ 3 �Ŀ�������
snapshotArr.set(0,5);  // �� array[0] = 5
snapshotArr.snap();  // ��ȡ���գ����� snap_id = 0
snapshotArr.set(0,6);
snapshotArr.get(0,0);  // ��ȡ snap_id = 0 �Ŀ����� array[0] ��ֵ������ 5
 

��ʾ��

1 <= length <= 50000
��Ŀ������50000 ��set��snap���� get�ĵ��� ��
0 <= index < length
0 <= snap_id < ���ǵ��� snap() ���ܴ���
0 <= val <= 10^9