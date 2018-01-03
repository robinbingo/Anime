package xyz.robinbingo.anime.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TAnimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAnimeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andForeignNameIsNull() {
            addCriterion("foreign_name is null");
            return (Criteria) this;
        }

        public Criteria andForeignNameIsNotNull() {
            addCriterion("foreign_name is not null");
            return (Criteria) this;
        }

        public Criteria andForeignNameEqualTo(String value) {
            addCriterion("foreign_name =", value, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameNotEqualTo(String value) {
            addCriterion("foreign_name <>", value, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameGreaterThan(String value) {
            addCriterion("foreign_name >", value, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_name >=", value, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameLessThan(String value) {
            addCriterion("foreign_name <", value, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameLessThanOrEqualTo(String value) {
            addCriterion("foreign_name <=", value, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameLike(String value) {
            addCriterion("foreign_name like", value, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameNotLike(String value) {
            addCriterion("foreign_name not like", value, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameIn(List<String> values) {
            addCriterion("foreign_name in", values, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameNotIn(List<String> values) {
            addCriterion("foreign_name not in", values, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameBetween(String value1, String value2) {
            addCriterion("foreign_name between", value1, value2, "foreignName");
            return (Criteria) this;
        }

        public Criteria andForeignNameNotBetween(String value1, String value2) {
            addCriterion("foreign_name not between", value1, value2, "foreignName");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNull() {
            addCriterion("chinese_name is null");
            return (Criteria) this;
        }

        public Criteria andChineseNameIsNotNull() {
            addCriterion("chinese_name is not null");
            return (Criteria) this;
        }

        public Criteria andChineseNameEqualTo(String value) {
            addCriterion("chinese_name =", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotEqualTo(String value) {
            addCriterion("chinese_name <>", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThan(String value) {
            addCriterion("chinese_name >", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameGreaterThanOrEqualTo(String value) {
            addCriterion("chinese_name >=", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThan(String value) {
            addCriterion("chinese_name <", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLessThanOrEqualTo(String value) {
            addCriterion("chinese_name <=", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameLike(String value) {
            addCriterion("chinese_name like", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotLike(String value) {
            addCriterion("chinese_name not like", value, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameIn(List<String> values) {
            addCriterion("chinese_name in", values, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotIn(List<String> values) {
            addCriterion("chinese_name not in", values, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameBetween(String value1, String value2) {
            addCriterion("chinese_name between", value1, value2, "chineseName");
            return (Criteria) this;
        }

        public Criteria andChineseNameNotBetween(String value1, String value2) {
            addCriterion("chinese_name not between", value1, value2, "chineseName");
            return (Criteria) this;
        }

        public Criteria andEpisodeIsNull() {
            addCriterion("episode is null");
            return (Criteria) this;
        }

        public Criteria andEpisodeIsNotNull() {
            addCriterion("episode is not null");
            return (Criteria) this;
        }

        public Criteria andEpisodeEqualTo(Integer value) {
            addCriterion("episode =", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeNotEqualTo(Integer value) {
            addCriterion("episode <>", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeGreaterThan(Integer value) {
            addCriterion("episode >", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("episode >=", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeLessThan(Integer value) {
            addCriterion("episode <", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeLessThanOrEqualTo(Integer value) {
            addCriterion("episode <=", value, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeIn(List<Integer> values) {
            addCriterion("episode in", values, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeNotIn(List<Integer> values) {
            addCriterion("episode not in", values, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeBetween(Integer value1, Integer value2) {
            addCriterion("episode between", value1, value2, "episode");
            return (Criteria) this;
        }

        public Criteria andEpisodeNotBetween(Integer value1, Integer value2) {
            addCriterion("episode not between", value1, value2, "episode");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartIsNull() {
            addCriterion("broadcast_start is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartIsNotNull() {
            addCriterion("broadcast_start is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartEqualTo(String value) {
            addCriterion("broadcast_start =", value, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartNotEqualTo(String value) {
            addCriterion("broadcast_start <>", value, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartGreaterThan(String value) {
            addCriterion("broadcast_start >", value, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartGreaterThanOrEqualTo(String value) {
            addCriterion("broadcast_start >=", value, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartLessThan(String value) {
            addCriterion("broadcast_start <", value, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartLessThanOrEqualTo(String value) {
            addCriterion("broadcast_start <=", value, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartLike(String value) {
            addCriterion("broadcast_start like", value, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartNotLike(String value) {
            addCriterion("broadcast_start not like", value, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartIn(List<String> values) {
            addCriterion("broadcast_start in", values, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartNotIn(List<String> values) {
            addCriterion("broadcast_start not in", values, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartBetween(String value1, String value2) {
            addCriterion("broadcast_start between", value1, value2, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastStartNotBetween(String value1, String value2) {
            addCriterion("broadcast_start not between", value1, value2, "broadcastStart");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndIsNull() {
            addCriterion("broadcast_end is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndIsNotNull() {
            addCriterion("broadcast_end is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndEqualTo(String value) {
            addCriterion("broadcast_end =", value, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndNotEqualTo(String value) {
            addCriterion("broadcast_end <>", value, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndGreaterThan(String value) {
            addCriterion("broadcast_end >", value, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndGreaterThanOrEqualTo(String value) {
            addCriterion("broadcast_end >=", value, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndLessThan(String value) {
            addCriterion("broadcast_end <", value, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndLessThanOrEqualTo(String value) {
            addCriterion("broadcast_end <=", value, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndLike(String value) {
            addCriterion("broadcast_end like", value, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndNotLike(String value) {
            addCriterion("broadcast_end not like", value, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndIn(List<String> values) {
            addCriterion("broadcast_end in", values, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndNotIn(List<String> values) {
            addCriterion("broadcast_end not in", values, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndBetween(String value1, String value2) {
            addCriterion("broadcast_end between", value1, value2, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andBroadcastEndNotBetween(String value1, String value2) {
            addCriterion("broadcast_end not between", value1, value2, "broadcastEnd");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIsNull() {
            addCriterion("is_finished is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIsNotNull() {
            addCriterion("is_finished is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishedEqualTo(String value) {
            addCriterion("is_finished =", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotEqualTo(String value) {
            addCriterion("is_finished <>", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedGreaterThan(String value) {
            addCriterion("is_finished >", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedGreaterThanOrEqualTo(String value) {
            addCriterion("is_finished >=", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLessThan(String value) {
            addCriterion("is_finished <", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLessThanOrEqualTo(String value) {
            addCriterion("is_finished <=", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedLike(String value) {
            addCriterion("is_finished like", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotLike(String value) {
            addCriterion("is_finished not like", value, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedIn(List<String> values) {
            addCriterion("is_finished in", values, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotIn(List<String> values) {
            addCriterion("is_finished not in", values, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedBetween(String value1, String value2) {
            addCriterion("is_finished between", value1, value2, "isFinished");
            return (Criteria) this;
        }

        public Criteria andIsFinishedNotBetween(String value1, String value2) {
            addCriterion("is_finished not between", value1, value2, "isFinished");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekIsNull() {
            addCriterion("broadcast_week is null");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekIsNotNull() {
            addCriterion("broadcast_week is not null");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekEqualTo(String value) {
            addCriterion("broadcast_week =", value, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekNotEqualTo(String value) {
            addCriterion("broadcast_week <>", value, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekGreaterThan(String value) {
            addCriterion("broadcast_week >", value, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekGreaterThanOrEqualTo(String value) {
            addCriterion("broadcast_week >=", value, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekLessThan(String value) {
            addCriterion("broadcast_week <", value, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekLessThanOrEqualTo(String value) {
            addCriterion("broadcast_week <=", value, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekLike(String value) {
            addCriterion("broadcast_week like", value, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekNotLike(String value) {
            addCriterion("broadcast_week not like", value, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekIn(List<String> values) {
            addCriterion("broadcast_week in", values, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekNotIn(List<String> values) {
            addCriterion("broadcast_week not in", values, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekBetween(String value1, String value2) {
            addCriterion("broadcast_week between", value1, value2, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andBroadcastWeekNotBetween(String value1, String value2) {
            addCriterion("broadcast_week not between", value1, value2, "broadcastWeek");
            return (Criteria) this;
        }

        public Criteria andIsIncludedIsNull() {
            addCriterion("is_included is null");
            return (Criteria) this;
        }

        public Criteria andIsIncludedIsNotNull() {
            addCriterion("is_included is not null");
            return (Criteria) this;
        }

        public Criteria andIsIncludedEqualTo(String value) {
            addCriterion("is_included =", value, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedNotEqualTo(String value) {
            addCriterion("is_included <>", value, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedGreaterThan(String value) {
            addCriterion("is_included >", value, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedGreaterThanOrEqualTo(String value) {
            addCriterion("is_included >=", value, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedLessThan(String value) {
            addCriterion("is_included <", value, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedLessThanOrEqualTo(String value) {
            addCriterion("is_included <=", value, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedLike(String value) {
            addCriterion("is_included like", value, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedNotLike(String value) {
            addCriterion("is_included not like", value, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedIn(List<String> values) {
            addCriterion("is_included in", values, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedNotIn(List<String> values) {
            addCriterion("is_included not in", values, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedBetween(String value1, String value2) {
            addCriterion("is_included between", value1, value2, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsIncludedNotBetween(String value1, String value2) {
            addCriterion("is_included not between", value1, value2, "isIncluded");
            return (Criteria) this;
        }

        public Criteria andIsWatchedIsNull() {
            addCriterion("is_watched is null");
            return (Criteria) this;
        }

        public Criteria andIsWatchedIsNotNull() {
            addCriterion("is_watched is not null");
            return (Criteria) this;
        }

        public Criteria andIsWatchedEqualTo(String value) {
            addCriterion("is_watched =", value, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedNotEqualTo(String value) {
            addCriterion("is_watched <>", value, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedGreaterThan(String value) {
            addCriterion("is_watched >", value, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedGreaterThanOrEqualTo(String value) {
            addCriterion("is_watched >=", value, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedLessThan(String value) {
            addCriterion("is_watched <", value, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedLessThanOrEqualTo(String value) {
            addCriterion("is_watched <=", value, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedLike(String value) {
            addCriterion("is_watched like", value, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedNotLike(String value) {
            addCriterion("is_watched not like", value, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedIn(List<String> values) {
            addCriterion("is_watched in", values, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedNotIn(List<String> values) {
            addCriterion("is_watched not in", values, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedBetween(String value1, String value2) {
            addCriterion("is_watched between", value1, value2, "isWatched");
            return (Criteria) this;
        }

        public Criteria andIsWatchedNotBetween(String value1, String value2) {
            addCriterion("is_watched not between", value1, value2, "isWatched");
            return (Criteria) this;
        }

        public Criteria andWatchTimeIsNull() {
            addCriterion("watch_time is null");
            return (Criteria) this;
        }

        public Criteria andWatchTimeIsNotNull() {
            addCriterion("watch_time is not null");
            return (Criteria) this;
        }

        public Criteria andWatchTimeEqualTo(String value) {
            addCriterion("watch_time =", value, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeNotEqualTo(String value) {
            addCriterion("watch_time <>", value, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeGreaterThan(String value) {
            addCriterion("watch_time >", value, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeGreaterThanOrEqualTo(String value) {
            addCriterion("watch_time >=", value, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeLessThan(String value) {
            addCriterion("watch_time <", value, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeLessThanOrEqualTo(String value) {
            addCriterion("watch_time <=", value, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeLike(String value) {
            addCriterion("watch_time like", value, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeNotLike(String value) {
            addCriterion("watch_time not like", value, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeIn(List<String> values) {
            addCriterion("watch_time in", values, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeNotIn(List<String> values) {
            addCriterion("watch_time not in", values, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeBetween(String value1, String value2) {
            addCriterion("watch_time between", value1, value2, "watchTime");
            return (Criteria) this;
        }

        public Criteria andWatchTimeNotBetween(String value1, String value2) {
            addCriterion("watch_time not between", value1, value2, "watchTime");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(BigDecimal value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(BigDecimal value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(BigDecimal value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(BigDecimal value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(BigDecimal value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<BigDecimal> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<BigDecimal> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}