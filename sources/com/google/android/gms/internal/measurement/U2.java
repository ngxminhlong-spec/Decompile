package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class U2 implements T2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1535j1 f11831a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1535j1 f11832b;
    public static final C1535j1 c;

    static {
        B0.q qVar = new B0.q(AbstractC1525h1.a(), false, true);
        qVar.k("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f11831a = qVar.k("measurement.audience.refresh_event_count_filters_timestamp", false);
        f11832b = qVar.k("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        c = qVar.k("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
