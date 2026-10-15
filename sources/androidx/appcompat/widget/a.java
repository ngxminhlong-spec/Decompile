package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ SearchView f2639o;

    public a(SearchView searchView) {
        this.f2639o = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SearchView searchView = this.f2639o;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.f2556D;
        if (view == searchView.f2560H) {
            searchView.w(false);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
            View.OnClickListener onClickListener = searchView.f2577c0;
            if (onClickListener != null) {
                onClickListener.onClick(searchView);
                return;
            }
            return;
        }
        if (view == searchView.f2562J) {
            searchView.m();
            return;
        }
        if (view == searchView.f2561I) {
            searchView.q();
            return;
        }
        if (view != searchView.f2563K) {
            if (view == searchAutoComplete) {
                searchView.l();
                return;
            }
            return;
        }
        SearchableInfo searchableInfo = searchView.f2590p0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    searchView.getContext().startActivity(searchView.k(searchView.f2574W, searchableInfo));
                }
            } else {
                Intent intent = new Intent(searchView.f2573V);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                searchView.getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
}
