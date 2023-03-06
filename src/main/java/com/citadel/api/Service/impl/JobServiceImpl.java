package com.citadel.api.Service.impl;

import com.citadel.api.Domain.Job;
import com.citadel.api.Service.JobService;
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
        jobList.add(new Job(1, "암살자", "암살할 캐릭터의 이름을 선언합니다. 암살된 캐릭터는 자기 차례를 쉽니다."));
        jobList.add(new Job(1, "마녀", "자원 얻기 행동 후, 마법을 걸 캐릭터의 이름을 선언하고 자기 차례를 멈춥니다. 마법에 걸린 캐릭터가 자원 얻기 행동을 했다면, 해당 캐릭터의 능력과 남은 차례를 빼앗아 사용합니다."));
        jobList.add(new Job(1, "치안판사", ""));

        // 2번 직업
        jobList.add(new Job(2, "도둑", "금화를 훔쳐올 목표 캐릭터의 이름을 선언합니다. 목표 캐릭터가 호명될 때, 목표 캐릭터의 개인 금고에서 금화 전부를 즉시 가져옵니다."));
        jobList.add(new Job(2, "첩자", ""));
        jobList.add(new Job(2, "협박범", ""));

        // 3번 직업
        jobList.add(new Job(3, "마술사", "다른 플레이어와 손에 든 카드 전부를 서로 교환하거나, 또는 손에 든 카드를 원하는 만큼 버리고 똑같은 수만큼 건물 카드 더미에서 카드를 가져옵니다."));
        jobList.add(new Job(3, "마법사", "다른 플레이어 1명의 카드를 보고, 그중 1장을 선택해 가져옵니다. 가져온 그 카드는 건설비용을 내고 즉시 건설하거나, 손에 듭니다. 이름이 똑같은 건물을 여러 채 건설할 수 있습니다."));
        jobList.add(new Job(3, "예언자", ""));

        // 4번 직업
        jobList.add(new Job(4, "왕", "왕관을 가져옵니다 자기 도시의 귀족 건물 수만큼 금화를 받습니다."));
        jobList.add(new Job(4, "황제", "왕관 주인이 아닌 플레이어(황제 본인 제외)에게 왕관을 주고, 그 플레이어의 금화 1닢 또는 카드 1장을 가져옵니다. 자기 도시의 귀족 건물 수만큼 금화를 받습니다."));
        jobList.add(new Job(4, "대공", ""));

        // 5번 직업
        jobList.add(new Job(5, "주교", "자기 도시의 건물에는 8번 캐릭터가 절대로 능력을 쓸 수 없습니다 자기 도시의 종교 건물 수만큼 금화를 받습니다."));
        jobList.add(new Job(5, "수도원장", "가장 금화가 많은 플레이어에게서 금화 1닢을 받습니다. 자기 도시의 종교 건물 수만큼 금화 또는 카드를 받습니다."));
        jobList.add(new Job(5, "추기경", ""));

        // 6번 직업
        jobList.add(new Job(6, "상인", "추가로 금화 1닢을 받습니다. 자기 도시의 상업 건물 수만큼 금화를 받습니다."));
        jobList.add(new Job(6, "연금술사", "자기 차례가 끝날 때, 이번 차례에 건설비용으로 지불한 금화를 전부 돌려 받습니다. 현재 가진 금화보다 건설비용이 비싼 건물은 절대로 건설할 수 없습니다."));
        jobList.add(new Job(6, "교역상", ""));

        // 7번 직업
        jobList.add(new Job(7, "건축가", "추가로 카드 2장을 받습니다. 건물을 3채까지 건설할 수 있습니다."));
        jobList.add(new Job(7, "항해사", "추가로 금화 4닢 또는 카드 4장을 받습니다. 절대로 건물을 건설할 수 없습니다."));
        jobList.add(new Job(7, "학자", ""));

        // 8번 직업
        jobList.add(new Job(8, "장군", "원하는 건물 한 채를 파괴할 수 있습니다(파괴비용은 해당 건물 건설 비용보다 금화 1닢 적습니다). 자기 도시의 군사 건물 수만큼 금화를 받습니다."));
        jobList.add(new Job(8, "외교관", "다른 플레이어 도시의 건물 1채와 자기 도시의 건물 1채를 교환할 수 있습니다(상대 건물이 더 비싸다면 그 차이만큼의 금화를 상대에게 줍니다). 자기 도시의 군사 건물 수만큼 금화를 받습니다."));
        jobList.add(new Job(8, "육군대장", ""));

        // 9번 직업
        jobList.add(new Job(9, "왕비", "공개된 4번 캐릭터가 자기 옆자리에 있다면, 금화 3닢을 받습니다."));
        jobList.add(new Job(9, "예술가", "자기 도시의 건물에 자기 개인금고의 금화를 한 닢 올려 장식합니다(최대 2채까지 장식할 수 있습니다). 장식된 건물은 건설비용이 1닢 오릅니다. 건물마다 한 번씩만 장식할 수 있습니다."));
        jobList.add(new Job(9, "세리", "누구든 건물을 건설한 플레이어는 즉시 금화 1닢을 세리 캐릭터 토큰 위에 놓습니다(세리 제외). 세리 캐릭터 토큰 위에 놓여있는 금화를 전부 가져올 수 있습니다."));

        return jobList;
    }
}
