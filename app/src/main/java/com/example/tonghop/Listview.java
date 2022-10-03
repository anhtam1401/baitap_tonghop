package com.example.tonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.content.Intent;

import java.util.ArrayList;

public class Listview extends AppCompatActivity {

    ListView lvcauthu;
    ArrayList<Cauthu> arraycauthu;
    CauthuAdapter adapter;
    ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Anhxa();

        adapter = new CauthuAdapter(this,R.layout.dong_cau_thu, arraycauthu);
        lvcauthu.setAdapter(adapter);


        lvcauthu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Listview.this, Detail.class);
                Cauthu cauthu = arraycauthu.get(i);
                intent.putExtra("ten", cauthu.getTen());
                intent.putExtra("noidung", cauthu.getNoidung());
                intent.putExtra("hinh", cauthu.getHinh());
                startActivity(intent);
            }
        });

        imgBack = (ImageView) findViewById(R.id.imageviewBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(Listview.this, Home.class);
                startActivity(back);
            }
        });


    }
    private  void Anhxa(){
        lvcauthu = (ListView) findViewById(R.id.listviewCauthu);
        arraycauthu = new ArrayList<>();

        arraycauthu.add(new Cauthu("Lionel Messi","24 tháng 6, 1987","Lionel Andrés Messi sinh ngày 24 tháng 6 năm 1987, còn được gọi là Leo Messi, là một cầu thủ bóng đá chuyên nghiệp người Argentina hiện đang thi đấu ở vị trí tiền đạo cho câu lạc bộ Ligue 1 Paris Saint-Germain và là đội trưởng của đội tuyển bóng đá quốc gia Argentina. Được coi là cầu thủ xuất sắc nhất thế giới và là một trong những cầu thủ vĩ đại nhất mọi thời đại, Messi giữ kỷ lục 7 lần giành Quả bóng vàng, 6 lần giành Chiếc giày vàng châu  u và vào năm 2020 được xếp vào Ballon d'Or Dream Team. Trước khi rời câu lạc bộ vào năm 2021, anh đã cống hiến toàn bộ sự nghiệp của mình cho Barcelona, tại đây anh đã giành được kỷ lục 35 danh hiệu cấp câu lạc bộ, bao gồm 10 La Liga, 7 Copa del Rey và 4 UEFA Champions League. Là một tay săn bàn lão luyện và cầu thủ kiến thiết xuất sắc, Messi giữ kỷ lục là cầu thủ ghi nhiều bàn thắng nhất ở La Liga (474), cầu thủ ghi nhiều bàn thắng nhất trong một mùa giải La Liga (50), nhiều hat-trick nhất ở La Liga (36) và UEFA Champions League (8), nhiều pha kiến tạo nhất ở La Liga (192), nhiều pha kiến tạo nhất trong một mùa giải La Liga (21)[10] và Copa América (17). Anh cũng nắm giữ kỷ lục nam cầu thủ ghi nhiều bàn thắng quốc tế nhất khu vực Nam Mỹ (81). Anh đã ghi hơn 750 bàn thắng trong sự nghiệp cho câu lạc bộ và đội tuyển quốc gia, là cầu thủ ghi nhiều bàn thắng nhất từ trước đến nay cho một câu lạc bộ.",R.drawable.messi,R.drawable.argentina));
        arraycauthu.add(new Cauthu("Ronaldinho","21 tháng 3, 1980","Ronaldo de Assis Moreira (sinh ngày 21 tháng 3 năm 1980 tại Porto Alegre, Brasil), thường được biết đến với cái tên Ronaldinho Gaúcho hay đơn giản là Ronaldinho, là một cựu cầu thủ bóng đá chuyên nghiệp người Brasil chơi ở vị trí tiền vệ công và tiền đạo cánh. Được coi là một trong những cầu thủ xuất sắc nhất trong thế hệ của mình và được nhiều người coi là một trong những cầu thủ vĩ đại nhất mọi thời đại, Ronaldinho đã giành được 2 giải Cầu thủ xuất sắc nhất năm của FIFA và 1 Quả bóng vàng. Là một biểu tượng toàn cầu, anh nổi tiếng với kỹ thuật, sự sáng tạo, khả năng rê dắt và độ chính xác từ những cú sút phạt, cũng như sử dụng kỹ năng, những cú sút xa, những đường chuyền không cần nhìn và những pha ngả người móc bóng. Năm 2004, anh được Pelé điền tên vào danh sách FIFA 100 những cầu thủ còn sống vĩ đại nhất thế giới.",R.drawable.ronaldinho,R.drawable.brazil));
        arraycauthu.add(new Cauthu("Pelé","23 tháng 10, 1940","Edson Arantes do Nascimento  sinh ngày 23 tháng 10 năm 1940), được biết đến nhiều nhất với tên Pelé, là một cựu cầu thủ bóng đá nổi tiếng người Brasil. Với biệt danh( Vua bóng đá), ông được coi là một trong những cầu thủ bóng đá vĩ đại nhất mọi thời đại. Vào năm 1999, ông được bầu chọn là Cầu thủ xuất sắc nhất thế kỉ 20 bởi hiệp hội IFFHS. Cũng trong năm đó, ông được IOC bầu chọn là Vận động viên của thế kỉ và được tạp chí TIME đưa vào danh sách 100 người có ảnh hưởng lớn nhất thế giới.",R.drawable.pele,R.drawable.brazil));
        arraycauthu.add(new Cauthu("Cristiano Ronaldo","5 tháng 2, 1985","Cristiano Ronaldo dos Santos Aveiro là một cầu thủ bóng đá chuyên nghiệp người Bồ Đào Nha hiện đang thi đấu ở vị trí tiền đạo cho câu lạc bộ Premier League Manchester United và là đội trưởng của đội tuyển bóng đá quốc gia Bồ Đào Nha. Được coi là cầu thủ xuất sắc nhất thế giới và là một trong những cầu thủ vĩ đại nhất mọi thời đại, Ronaldo là chủ nhân của 5 Quả bóng vàng châu  u và 4 Chiếc giày vàng châu  u, cả hai đều là kỷ lục của một cầu thủ châu  u. Anh đã giành được 32 danh hiệu trong sự nghiệp của mình, bao gồm 7 chức vô địch quốc gia, 5 UEFA Champions League, 1 UEFA European Championship và 1 UEFA Nations League. Ronaldo đang nắm giữ kỷ lục nam cầu thủ châu  u có nhiều lần ra sân quốc tế nhất (189), cầu thủ ghi nhiều bàn thắng quốc tế nhất (117), cầu thủ ra sân nhiều nhất (183), ghi nhiều bàn thắng nhất (140) và có nhiều pha kiến tạo nhất (42) tại UEFA Champions League, cầu thủ ghi nhiều bàn thắng nhất giải vô địch bóng đá châu  u (14).Anh là một trong số ít những cầu thủ đã có hơn 1.100 lần ra sân và đã ghi hơn 800 bàn thắng trong sự nghiệp cho câu lạc bộ và đội tuyển quốc gia.",R.drawable.ronaldo,R.drawable.portugal));
        arraycauthu.add(new Cauthu("Diego Maradona","30 tháng 10, 1960","Diego Armando Maradona 30 tháng 10 năm 1960 – 25 tháng 11 năm 2020 là một cố cầu thủ và huấn luyện viên bóng đá người Argentina. Được coi là một trong những cầu thủ vĩ đại nhất lịch sử, ông là một trong hai người cùng nhận giải Cầu thủ xuất sắc nhất thế kỷ 20 của FIFA.Nhãn quan chiến thuật, khả năng chuyền bóng, kiểm soát bóng và rê bóng của Maradona kết hợp với vóc dáng nhỏ con của ông, giúp ông có trọng tâm thấp cho phép Maradona cơ động hơn hầu hết các cầu thủ khác. Sự hiện diện và khả năng lãnh đạo của ông trên sân có ảnh hưởng lớn đến thành tích chung của toàn đội, mặc dù ông thường bị các cầu thủ đối phương theo sát. Ngoài khả năng sáng tạo, ông còn sở hữu con mắt săn bàn nhạy bén và được biết đến như một chuyên gia sút phạt. Là một tài năng trời phú, Maradona được đặt cho biệt danh \"El Pibe de Oro\" (Cậu bé vàng), cái tên gắn liền với ông trong suốt sự nghiệp.Ông cũng có một cuộc sống ngoài sân cỏ đầy rắc rối, bị cấm thi đấu vào năm 1991 và 1994 vì lạm dụng ma túy.",R.drawable.maradona,R.drawable.argentina));
        arraycauthu.add(new Cauthu("Ronaldo","18 tháng 9, 1976","Ronaldo Luís Nazário de Lima sinh ngày 18 tháng 9 năm 1976), là một doanh nhân người Brazil, chủ tịch câu lạc bộ Real Valladolid, và là một cựu cầu thủ bóng đá từng chơi ở vị trí tiền đạo. Được mệnh danh là O Fenômeno (Người ngoài hành tinh), và anh được coi là một trong những cầu thủ xuất sắc nhất mọi thời đại. Là một tiền đạo đa năng, Ronaldo là người có ảnh hưởng lớn đến thế hệ tiền đạo sau này. Các giải thưởng cá nhân của anh bao gồm ba lần được vinh danh là Cầu thủ xuất sắc nhất năm của FIFA và giành được hai giải Quả bóng vàng.",R.drawable.ronaldobarazil,R.drawable.brazil));
    }


}