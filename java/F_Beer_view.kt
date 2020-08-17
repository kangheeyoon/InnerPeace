package com.project.innerpeace

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class F_Beer_view : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.category_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        val manager = GridLayoutManager(this@F_Beer_view, 2)
        
        val itemList1_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "펍카페1429",
                "#남/녀 화장실 구분",
                "덕계 \n 경기 양주시 평화로1429번길 10 \n 031-866-1429" +
                        "\n 매일 11:00 - 24:00둘째주 넷째주 일요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "엔젤링 테이스팅 펍",
                "#남/녀 화장실 구분",
                "의정부 \n 경기 의정부시 민락로 195 \n 031-928-5522" +
                        "\n 18:00 - 01:00 일요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(
                R.mipmap.ic_launcher,
                "사쿠라테이엔",
                "#남/녀 화장실 구분",
                "의정부 \n 경기 의정부시 오목로225번길 89-63 \n 031-852-0741" +
                        "\n 매일 17:00 - 03:00연중무휴 (재료소진시 시간관계없이 조기마감) \n 남/녀 화장실 구분"
            )
        )

        val itemList1_2 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "홍곱창", "#외부 #남/녀 화장실 구분",
                "회기 \n 서울 동대문구 회기로25길 60 \n 02-3295-1187" +
                        "\n 매일 14:00 - 23:30 일요일 휴무 \n 외부 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "봉쥬비어", "#남/녀 화장실 구분",
                "회기 \n 서울 동대문구 회기로 190 \n 02-965-5150" +
                        "\n 주중16:00 ~ 03:30 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "아도겐", "#남/녀 화장실 구분",
                "광운대 \n 서울 성북구 화랑로42길 50 \n 02-966-5079" +
                        "\n 매일 17:00 - 06:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "무나드", "#남/녀 화장실 구분",
                "청량리 \n 서울 동대문구 천호대로35길 65 \n 02-967-0423" +
                        "\n 평일 11:00-00:00주말 18:00 - 00:00 월요일 휴무 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_3 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "차차 티클럽", "#남/녀 화장실 구분",
                "동대문 \n 서울 종로구 종로46가길 13 \n 070-7755-4758" +
                        "\n 매일 13:00 ~ 22:00 월요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "박가네 빈대떡", "#남/녀 화장실 구분",
                "종로5가 \n 서울 종로구 종로32길 7 \n 02-2264-0847" +
                        "\n 매일 08:00 - 22:30 연중무휴 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "마천루", "#남/녀 화장실 구분",
                "종각 \n 서울 종로구 삼일대로17길 51 스타골드빌딩 \n 02-733-9922" +
                        "\n 매일 17:30 - 11:30 연중무휴 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "이자카야나무", "#남/녀 화장실 구분",
                "종각 \n 서울 종로구 종로10길 16 2,3층 \n 02-722-6787" +
                        "\n 매일 15:00 ~ 05:00 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_4 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "교동전선생", "#남/녀 화장실 구분",
                "시청 \n 서울 중구 남대문로9길 40 센터플레이스 1층 104,105호 \n 02-6031-8949" +
                        "\n 평일 11:00-10:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "르 캬바레 시떼", "#남/녀 화장실 구분",
                "시청 \n 서울 중구 소공로 119 LL층 \n 02-318-8766" +
                        "\n 매일 18:00 - 01:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "청담이상", "#남/녀 화장실 구분",
                "신도림 \n 서울 구로구 경인로 661 신도림 1차 푸르지오 1층 122호 \n 02-3667-2590" +
                        "\n 정보없음 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "역전할머니맥주", "#내부",
                "노량진 \n 서울 동작구 만양로 104 1층 \n 02-3280-8283" +
                        "\n 정보없음 \n 내부"
            ),
            Image(R.mipmap.ic_launcher,
                "역전할머니맥주", "#건물 내부",
                "신도림 \n 서울 구로구 경인로67길 23 \n 02-2634-5507" +
                        "\n 매일 17:00 - 03:00 \n 건물 내부"
            )
        )
        val itemList1_5 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "포차천국", "#남/녀 화장실 구분",
                "개봉 \n 서울 구로구 개봉로23가길 30 \n 02-2616-1090" +
                        "\n 매일 16:00 - 03:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "미소와인", "#남/녀 화장실 구분",
                "개봉 \n 서울 구로구 경인로40길 25 미소와인 \n 02-2688-6683" +
                        "\n 매일 18:00 - 03:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "호맥", "#남/녀 화장실 구분",
                "부천 \n 경기 부천시 부천로29번길 20 1층 \n 032-656-1228" +
                        "\n 매일 17:00 - 03:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "시장을여는사람들", "#남/녀 화장실 구분",
                "부천 \n 경기 부천시 부일로459번길 33 \n 010-6340-0732" +
                        "\n 매일 17:00 - 05:00 \n 남/녀 화장실 구분"
            )
        )

        val itemList1_6 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "휄리스", "#남/녀 화장실 구분",
                "인천 \n 인천 중구 홍예문로 56 \n 032-777-6992" +
                        "\n 032-777-6992 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "온도", "#남/녀 화장실 구분",
                "동인천 \n 인천 중구 우현로67번길 35-28 \n 010-3126-6734" +
                        "\n 매일 18:00 - 02:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "디지", "#남/녀 화장실 구분",
                "부평 \n 인천 부평구 경원대로1403번길 15 5층 501호 디지 \n 032-501-9462" +
                        "\n 매일 18:00 - 03:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "시장을여는사람들", "#내부 #남/녀 화장실 구분",
                "부평 \n 인천 부평구 경원대로1403번길 21 2층 \n 032-515-1610" +
                        "\n 매일 17:00 - 05:00 \n 남/녀 화장실 구분 \n 내"
            )
        )

        val itemList1_7 = listOf<Image>(
            Image(R.mipmap.ic_launcher,
                "육전면사무소", "#남/녀 화장실 구분",
                "가산디지털단지 \n 서울 금천구 벚꽃로 298 지하1층 \n 02-2083-8577" +
                        "\n 평일 11:00 - 21:30 일요일 휴무 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "평일 11:00 - 21:30 일요일 휴무", "#남/녀 화장실 구분",
                "가산디지털단지 \n 서울 금천구 가산디지털1로 168 \n 02-851-1188" +
                        "\n 매일 17:00 - 01:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "미식클럽", "#남/녀 화장실 구분",
                "수원 \n 경기 수원시 팔달구 향교로 3-2 3층 \n 070-4147-1111" +
                        "\n 매일 17:00 - 05:00 \n 남/녀 화장실 구분"
            ),
            Image(R.mipmap.ic_launcher,
                "꿀통", "#남/녀 화장실 구분",
                "수원 \n 경기 수원시 팔달구 향교로 30 \n 031-246-8254" +
                        "\n 평일 17:00 - 05:00, 주말 17:00 - 004:00 \n 남/녀 화장실 구분"
            )
        )

       val itemList7_1 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "스튜디오레이크", "#남/녀 화장실 구분",
                "가산디지털단지역\n 서울 금천구 디지털로 210\n 010-2520-9864\n " +
                        "월, 토요일 18:00 - 00:00 화~목요일 18:00 - 00:30 금요일 18:00 - 01:00 일요일 휴무\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "비어마켓낭만가", "#남/녀 화장실 구분",
                "광명사거리역\n 경기 광명시 오리로985번길 1\n 010-7163-2154\n " +
                        "매일 17:00 - 04:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "아맛나슈퍼 광명사거리점", "#남/녀 화장실 구분",
                "광명사거리역\n 경기 광명시 오리로985번길 6\n 02-2066-3684\n " +
                        "매일 17:00 - 05:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "프렌밀리", "#남/녀 화장실 구분",
                "장승배기역\n 서울 동작구 양녕로 271\n 010-3200-4660\n " +
                        "일~목요일 18:00 - 01:00 금~토요일 18:00 - 02:00\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_2 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "신사펍", "#남/녀 화장실 구분",
                "이수역\n 서울 동작구 동작대로 129\n 010-4849-1571\n " +
                        "매일 18:00 - 02:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "하얀집호프", "#남/녀 화장실 구분",
                "고속터미널역\n 서울 서초구 신반포로 189\n 02-594-9719\n " +
                        "평일 15:30 - 01:00, 토요일 15:30 - 01:00, 일요일 휴무\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "모보 바", "#남/녀 화장실 구분",
                "고속터미널역\n 서울 서초구 신반포로 176\n 02-6282-6739\n " +
                        "매일 18:00 - 01:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "보테가 라운지", "#남/녀 화장실 구분",
                "청담역\n 서울 강남구 도산대로 502\n 02-3446-5555\n " +
                        "월~목요일 20:00 - 02:00 금~토요일 20:00 - 04:00 일요일 휴무\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_3 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "어메이징브루잉컴퍼니", "#남/녀 화장실 구분",
                "뚝섬역\n 서울 성동구 성수일로4길 4\n 02-465-5208\n " +
                        "평일 18:00 - 01:00 토요일 16:00 - 01:00 일요일 16:00 - 24:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "MIXX LOUNGE BAR", "#남/녀 화장실 구분",
                "건대입구역\n 서울 광진구 동일로24길 102\n 02-498-8259\n " +
                        "매일 18:00 - 04:00 연중무휴\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "일레븐 라운지", "#남/녀 화장실 구분 #장애인 편의시설",
                "건대입구역\n 서울 광진구 동일로 172\n 02-498-2211\n " +
                        "매일 18:00 - 02:00 매일 18:00 - 01:00 금요일 20:00 - 02:00 토요일 20:00 - 02:00\n 남/녀 화장실 구분\n 장애인 편의시설\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "포차다락", "#남/녀 화장실 구분",
                "사가정역\n 서울 중랑구 면목로 336\n 010-4165-2314\n " +
                        "일~목요일 18:00 - 05:00 금,토 요일 아침 6시까지 영업\n 남/녀 화장실 구분\n"

            )
        )

        val itemList7_4 = listOf<Image>(
            Image(
                R.mipmap.ic_launcher,
                "라온", "#남/녀 화장실 구분",
                "태릉입구역\n 서울 중랑구 동일로 932\n 02-3296-0045\n " +
                        "매일 18:00 - 02:00\n 남/녀 화장실 구분\n"
            ),
            Image(
                R.mipmap.ic_launcher,
                "하토상의술방", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로3길 10\n 02-938-2252\n " +
                        "매일 16:30 - 02:30\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "시오코", "#남/녀 화장실 구분",
                "노원역\n 서울 노원구 상계로5길 26\n 02-936-5001\n " +
                        "매일 17:00 - 04:00\n 남/녀 화장실 구분\n"

            ),
            Image(
                R.mipmap.ic_launcher,
                "시골막걸리", "#남/녀 화장실 구분",
                "수락산역\n 서울 노원구 동일로 1530\n 02-931-9080\n " +
                        "매일 15:30 - 01:30 일요일12시마감\n 남/녀 화장실 구분\n"

            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.item_recyclerView)
        recyclerView.layoutManager = manager
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, itemList){
            val intent = Intent(this, Detail_view::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when (id) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
}
