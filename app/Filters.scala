/**
  * Created by araki on 2017/01/30.
  */
import play.api.http.HttpFilters
import play.filters.csrf.CSRFFilter
import javax.inject.{Inject, Singleton}

import play.api.mvc.EssentialFilter
import play.filters.headers.SecurityHeadersFilter

@Singleton
class Filters @Inject() (csrfFilter: CSRFFilter, securityHeadersFilter: SecurityHeadersFilter) extends HttpFilters {
  override def filters: Seq[EssentialFilter] = Seq(csrfFilter, securityHeadersFilter)
}
