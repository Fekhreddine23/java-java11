package java8.ex07;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Test;

/**
 * Exercice 07 - Instant
 */
public class DateAndTime_07_Test {

	@Test
	public void test_date_to_localdate() throws Exception {

		// TODO Créer une date Java 1 (12/02/2017)
		
		Date date = null;
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		

	    String date1 = "12/02/2017";
	    
	    date = simpleDateFormat.parse(date1);

		// TODO transformer la date en Instant
		Instant now = date.toInstant();
		
		ZoneId currentZone = ZoneId.systemDefault();

		// TODO transformer la date en LocalDate

		LocalDate result = LocalDate.ofInstant(now, currentZone);

		// TODO valoriser les différentes variables afin de rendre le test passant

		assertThat(result.getYear(), is(2017));
		assertThat(result.getMonth(), is(Month.FEBRUARY));
		assertThat(result.getDayOfMonth(), is(12));

	}
}
