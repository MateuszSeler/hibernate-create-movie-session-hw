package mate.academy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    @JoinColumn(name = "ticket_id")
    private List<Ticket> tickets;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private LocalDateTime showTime;

    public Long getId() {
        return id;
    }

    public Order setId(Long id) {
        this.id = id;
        return this;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public Order setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Order setUser(User user) {
        this.user = user;
        return this;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public Order setShowTime(LocalDateTime showTime) {
        this.showTime = showTime;
        return this;
    }

    @Override
    public String toString() {
        return "Order{"
                + "id=" + id
                + ", tickets=" + tickets
                + ", user=" + user
                + ", showTime=" + showTime
                + '}';
    }
}