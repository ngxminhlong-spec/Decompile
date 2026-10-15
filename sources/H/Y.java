package H;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class Y {
    public static /* bridge */ /* synthetic */ MeasurementManager d(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder e() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse i(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic j(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager k(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return MeasurementManager.class;
    }

    public static /* synthetic */ void n() {
        new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Class t() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void v() {
    }
}
