package com.citadel.api.Domain.Job.Service.Impl;

import com.citadel.api.Domain.Job.Model.Job;
import com.citadel.api.Domain.Job.Service.JobService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class JobServiceImpl  implements JobService {

    @Override
    public List<Job> getJobList() {

        List<Job> jobList = new ArrayList<>();

        // 1번 직업
        jobList.add(new Job(1, "암살자", "다른 캐릭터를 암살해서 차례를 진행하지 못하게 만듭니다."));
        jobList.add(new Job(1, "마녀", "다른 캐릭터에게 마법을 겁니다. 마법에 걸린 캐릭터에게서 캐릭터 능력과 건설 행동 기회를 빼앗아 사용합니다."));
        jobList.add(new Job(1, "치안판사", "다른 캐릭터에게 영장을 발부합니다. 몰수 대상이 된 캐릭터가 건설하는 건물을 몰수합니다."));

        // 2번 직업
        jobList.add(new Job(2, "도둑", "다른 캐릭터의 금화를 훕칩니다."));
        jobList.add(new Job(2, "첩자", "다른 플레이어가 손에 어떤 건물 카드를 들고 있을지 추측합니다. 추측이 맞았다면 금화를 빼앗고 건물 카드 더미에서 카드를 얻습니다."));
        jobList.add(new Job(2, "협박범", "다른 캐릭터를 협박합니다. 협박 대상이 뇌물을 바치지 않으면 금화를 모조리 빼앗습니다."));

        // 3번 직업
        jobList.add(new Job(3, "마술사", "손에 든 카드를 바꿀 수 있습니다."));
        jobList.add(new Job(3, "마법사", "다른 플레이어의 카드를 1장 가져옵니다. 이름이 똑같은 건물도 건설할 수 있습니다."));
        jobList.add(new Job(3, "예언자", "다른 플레이어들의 카드를 거둬들여 마음대로 나눠줍니다. 건물을 2채 지을 수 있습니다."));

        // 4번 직업
        jobList.add(new Job(4, "왕", "새로운 왕관 주인이 됩니다. 자기 귀족 선물 수만큼 금화를 얻습니다."));
        jobList.add(new Job(4, "황제", "새로운 왕관 주인을 책봉합니다. 자기 귀족 건물 수만큼 금화를 얻습니다."));
        jobList.add(new Job(4, "대공", "새로운 왕관 주인이 됩니다. 자기 귀족 선물 수만큼 금화를 얻습니다."));

        // 5번 직업
        jobList.add(new Job(5, "주교", "8번 캐릭터의 능력을 방어합니다. 자기 종교 건물 수만큼 금화를 얻습니다."));
        jobList.add(new Job(5, "수도원장", "부자에게서 돈을 받아갑니다.. 자기 종교 건물 수만큼 금화나 카드를 얻습니다"));
        jobList.add(new Job(5, "추기경", "건설비용이 부족하면 다른 플레이어에게 카드를 주고 금화를 받습니다. 자기 종교 건물 수만큼 카드를 얻습니다."));

        // 6번 직업
        jobList.add(new Job(6, "상인", "금화를 1닢 받습니다. 자기 상업 건물 수만큼 금화를 얻습니다."));
        jobList.add(new Job(6, "연금술사", "건설비용을 돌려받습니다."));
        jobList.add(new Job(6, "교역상", "상업 건물은 여러 채 지을 수 있습니다. 자기 상업 건물 수만큼 금화를 얻습니다."));

        // 7번 직업
        jobList.add(new Job(7, "건축가", "카드를 2장 받습니다. 건물을 3채 지을 수 있습니다."));
        jobList.add(new Job(7, "항해사", "자원을 많이 얻습니다. 건설을 못 합니다."));
        jobList.add(new Job(7, "학자", "카드를 많이 보고 그 중 1장을 골라 받습니다. 건물을 2채 지을 수 있습니다."));

        // 8번 직업
        jobList.add(new Job(8, "장군", "건물을 파괴합니다. 자기 군사 건물 수만큼 금화를 얻습니다."));
        jobList.add(new Job(8, "외교관", "건물을 교환합니다. 자기 군사 건물 수만큼 금화를 얻습니다."));
        jobList.add(new Job(8, "육군대장", "건물을 점령해서 가져옵니다. 자기 군사 건물 수만큼 금화를 얻습니다."));

        // 9번 직업
        jobList.add(new Job(9, "왕비", "4번 캐릭터 옆자리에 있다면 금화를 받습니다"));
        jobList.add(new Job(9, "예술가", "자기 건물의 가치를 높입니다"));
        jobList.add(new Job(9, "세리", "다른 캐릭터들이 낸 세금을 획득합니다"));

        return jobList;
    }
}
