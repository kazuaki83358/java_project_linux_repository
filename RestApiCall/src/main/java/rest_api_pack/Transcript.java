package rest_api_pack;

public class Transcript {
    private String id;
    private String status;
    private String text;
    private String audio_url;
    private String language_code;
    private boolean punctuate;
    private boolean format_text;
    private boolean dual_channel;
    private String webhook_url;
    private String webhook_auth_header_name;
    private String webhook_auth_header_value;
    private int audio_start_from;
    private int audio_end_at;
    private String[] word_boost;
    private String boost_param;
    private boolean filter_profanity;
    private boolean redact_pii;
    private boolean redact_pii_audio;
    private String redact_pii_audio_quality;
    private String[] redact_pii_policies;
    private String redact_pii_sub;
    private boolean speaker_labels;
    private int speakers_expected;
    private boolean content_safety;
    private boolean iab_categories;
    private String[] custom_spelling;
    private boolean disfluencies;
    private boolean sentiment_analysis;
    private boolean auto_chapters;
    private boolean entity_detection;
    private float speech_threshold;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAudio_url() {
        return audio_url;
    }

    public void setAudio_url(String audio_url) {
        this.audio_url = audio_url;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    public boolean isPunctuate() {
        return punctuate;
    }

    public void setPunctuate(boolean punctuate) {
        this.punctuate = punctuate;
    }

    public boolean isFormat_text() {
        return format_text;
    }

    public void setFormat_text(boolean format_text) {
        this.format_text = format_text;
    }

    public boolean isDual_channel() {
        return dual_channel;
    }

    public void setDual_channel(boolean dual_channel) {
        this.dual_channel = dual_channel;
    }

    public String getWebhook_url() {
        return webhook_url;
    }

    public void setWebhook_url(String webhook_url) {
        this.webhook_url = webhook_url;
    }

    public String getWebhook_auth_header_name() {
        return webhook_auth_header_name;
    }

    public void setWebhook_auth_header_name(String webhook_auth_header_name) {
        this.webhook_auth_header_name = webhook_auth_header_name;
    }

    public String getWebhook_auth_header_value() {
        return webhook_auth_header_value;
    }

    public void setWebhook_auth_header_value(String webhook_auth_header_value) {
        this.webhook_auth_header_value = webhook_auth_header_value;
    }

    public int getAudio_start_from() {
        return audio_start_from;
    }

    public void setAudio_start_from(int audio_start_from) {
        this.audio_start_from = audio_start_from;
    }

    public int getAudio_end_at() {
        return audio_end_at;
    }

    public void setAudio_end_at(int audio_end_at) {
        this.audio_end_at = audio_end_at;
    }

    public String[] getWord_boost() {
        return word_boost;
    }

    public void setWord_boost(String[] word_boost) {
        this.word_boost = word_boost;
    }

    public String getBoost_param() {
        return boost_param;
    }

    public void setBoost_param(String boost_param) {
        this.boost_param = boost_param;
    }

    public boolean isFilter_profanity() {
        return filter_profanity;
    }

    public void setFilter_profanity(boolean filter_profanity) {
        this.filter_profanity = filter_profanity;
    }

    public boolean isRedact_pii() {
        return redact_pii;
    }

    public void setRedact_pii(boolean redact_pii) {
        this.redact_pii = redact_pii;
    }

    public boolean isRedact_pii_audio() {
        return redact_pii_audio;
    }

    public void setRedact_pii_audio(boolean redact_pii_audio) {
        this.redact_pii_audio = redact_pii_audio;
    }

    public String getRedact_pii_audio_quality() {
        return redact_pii_audio_quality;
    }

    public void setRedact_pii_audio_quality(String redact_pii_audio_quality) {
        this.redact_pii_audio_quality = redact_pii_audio_quality;
    }

    public String[] getRedact_pii_policies() {
        return redact_pii_policies;
    }

    public void setRedact_pii_policies(String[] redact_pii_policies) {
        this.redact_pii_policies = redact_pii_policies;
    }

    public String getRedact_pii_sub() {
        return redact_pii_sub;
    }

    public void setRedact_pii_sub(String redact_pii_sub) {
        this.redact_pii_sub = redact_pii_sub;
    }

    public boolean isSpeaker_labels() {
        return speaker_labels;
    }

    public void setSpeaker_labels(boolean speaker_labels) {
        this.speaker_labels = speaker_labels;
    }

    public int getSpeakers_expected() {
        return speakers_expected;
    }

    public void setSpeakers_expected(int speakers_expected) {
        this.speakers_expected = speakers_expected;
    }

    public boolean isContent_safety() {
        return content_safety;
    }

    public void setContent_safety(boolean content_safety) {
        this.content_safety = content_safety;
    }

    public boolean isIab_categories() {
        return iab_categories;
    }

    public void setIab_categories(boolean iab_categories) {
        this.iab_categories = iab_categories;
    }

    public String[] getCustom_spelling() {
        return custom_spelling;
    }

    public void setCustom_spelling(String[] custom_spelling) {
        this.custom_spelling = custom_spelling;
    }

    public boolean isDisfluencies() {
        return disfluencies;
    }

    public void setDisfluencies(boolean disfluencies) {
        this.disfluencies = disfluencies;
    }

    public boolean isSentiment_analysis() {
        return sentiment_analysis;
    }

    public void setSentiment_analysis(boolean sentiment_analysis) {
        this.sentiment_analysis = sentiment_analysis;
    }

    public boolean isAuto_chapters() {
        return auto_chapters;
    }

    public void setAuto_chapters(boolean auto_chapters) {
        this.auto_chapters = auto_chapters;
    }

    public boolean isEntity_detection() {
        return entity_detection;
    }

    public void setEntity_detection(boolean entity_detection) {
        this.entity_detection = entity_detection;
    }

    public float getSpeech_threshold() {
        return speech_threshold;
    }

    public void setSpeech_threshold(float speech_threshold) {
        this.speech_threshold = speech_threshold;
    }
}

