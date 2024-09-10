package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.MeetingRecord;

@Repository
public interface repository extends JpaRepository<MeetingRecord, Long> {
    // Repositório básico para salvar e buscar atas de reuniões
}
