package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I2 implements H2 {

    /* renamed from: A, reason: collision with root package name */
    public static final C1535j1 f11742A;

    /* renamed from: B, reason: collision with root package name */
    public static final C1535j1 f11743B;

    /* renamed from: C, reason: collision with root package name */
    public static final C1535j1 f11744C;

    /* renamed from: D, reason: collision with root package name */
    public static final C1535j1 f11745D;

    /* renamed from: E, reason: collision with root package name */
    public static final C1535j1 f11746E;

    /* renamed from: F, reason: collision with root package name */
    public static final C1535j1 f11747F;

    /* renamed from: G, reason: collision with root package name */
    public static final C1535j1 f11748G;

    /* renamed from: H, reason: collision with root package name */
    public static final C1535j1 f11749H;

    /* renamed from: I, reason: collision with root package name */
    public static final C1535j1 f11750I;

    /* renamed from: J, reason: collision with root package name */
    public static final C1535j1 f11751J;

    /* renamed from: a, reason: collision with root package name */
    public static final C1535j1 f11752a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1535j1 f11753b;
    public static final C1535j1 c;
    public static final C1535j1 d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1535j1 f11754e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1535j1 f11755f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1535j1 f11756g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1535j1 f11757h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1535j1 f11758i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1535j1 f11759j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1535j1 f11760k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1535j1 f11761l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1535j1 f11762m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1535j1 f11763n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1535j1 f11764o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1535j1 f11765p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1535j1 f11766q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1535j1 f11767r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1535j1 f11768s;

    /* renamed from: t, reason: collision with root package name */
    public static final C1535j1 f11769t;

    /* renamed from: u, reason: collision with root package name */
    public static final C1535j1 f11770u;

    /* renamed from: v, reason: collision with root package name */
    public static final C1535j1 f11771v;

    /* renamed from: w, reason: collision with root package name */
    public static final C1535j1 f11772w;

    /* renamed from: x, reason: collision with root package name */
    public static final C1535j1 f11773x;
    public static final C1535j1 y;

    /* renamed from: z, reason: collision with root package name */
    public static final C1535j1 f11774z;

    static {
        B0.q qVar = new B0.q(AbstractC1525h1.a(), false, true);
        f11752a = qVar.h("measurement.ad_id_cache_time", 10000L);
        f11753b = qVar.h("measurement.max_bundles_per_iteration", 100L);
        c = qVar.h("measurement.config.cache_time", 86400000L);
        qVar.i("measurement.log_tag", "FA");
        d = new C1535j1(qVar, "measurement.config.url_authority", "app-measurement.com", 3);
        f11754e = new C1535j1(qVar, "measurement.config.url_scheme", "https", 3);
        f11755f = qVar.h("measurement.upload.debug_upload_interval", 1000L);
        f11756g = qVar.h("measurement.lifetimevalue.max_currency_tracked", 4L);
        f11757h = qVar.h("measurement.store.max_stored_events_per_app", 100000L);
        f11758i = qVar.h("measurement.experiment.max_ids", 50L);
        f11759j = qVar.h("measurement.audience.filter_result_max_count", 200L);
        f11760k = qVar.h("measurement.alarm_manager.minimum_interval", 60000L);
        f11761l = qVar.h("measurement.upload.minimum_delay", 500L);
        f11762m = qVar.h("measurement.monitoring.sample_period_millis", 86400000L);
        f11763n = qVar.h("measurement.upload.realtime_upload_interval", 10000L);
        f11764o = qVar.h("measurement.upload.refresh_blacklisted_config_interval", 604800000L);
        qVar.h("measurement.config.cache_time.service", 3600000L);
        f11765p = qVar.h("measurement.service_client.idle_disconnect_millis", 5000L);
        qVar.i("measurement.log_tag.service", "FA-SVC");
        f11766q = qVar.h("measurement.upload.stale_data_deletion_interval", 86400000L);
        f11767r = qVar.h("measurement.sdk.attribution.cache.ttl", 604800000L);
        f11768s = qVar.h("measurement.redaction.app_instance_id.ttl", 7200000L);
        f11769t = qVar.h("measurement.upload.backoff_period", 43200000L);
        f11770u = qVar.h("measurement.upload.initial_upload_delay_time", 15000L);
        f11771v = qVar.h("measurement.upload.interval", 3600000L);
        f11772w = qVar.h("measurement.upload.max_bundle_size", 65536L);
        f11773x = qVar.h("measurement.upload.max_bundles", 100L);
        y = qVar.h("measurement.upload.max_conversions_per_day", 500L);
        f11774z = qVar.h("measurement.upload.max_error_events_per_day", 1000L);
        f11742A = qVar.h("measurement.upload.max_events_per_bundle", 1000L);
        f11743B = qVar.h("measurement.upload.max_events_per_day", 100000L);
        f11744C = qVar.h("measurement.upload.max_public_events_per_day", 50000L);
        f11745D = qVar.h("measurement.upload.max_queue_time", 2419200000L);
        f11746E = qVar.h("measurement.upload.max_realtime_events_per_day", 10L);
        f11747F = qVar.h("measurement.upload.max_batch_size", 65536L);
        f11748G = qVar.h("measurement.upload.retry_count", 6L);
        f11749H = qVar.h("measurement.upload.retry_time", 1800000L);
        f11750I = new C1535j1(qVar, "measurement.upload.url", "https://app-measurement.com/a", 3);
        f11751J = qVar.h("measurement.upload.window_interval", 3600000L);
    }
}
