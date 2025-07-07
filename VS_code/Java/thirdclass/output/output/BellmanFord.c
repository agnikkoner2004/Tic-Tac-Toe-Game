#include<stdio.h>
#include<stdlib.h>
#define INFINITY 99999
struct Edge
{
    int u,v,w;
};
struct Graph
{
    int V, E;
    struct Edge* edge;
};
void BellmanFord(struct Graph* graph, int source);
void display(int arr[], int n);
        int main(void){
            struct Graph* graph = (struct Graph*)malloc(sizeof(struct Graph));
            graph->V = 4; 
            graph->E = 5;
            graph->edge = (struct Edge*)malloc(graph->E * sizeof(struct Edge));
            graph->edge[0].u = 0; graph->edge[0].v = 1; graph->edge[0].w = 5;
            graph->edge[1].u = 0; graph->edge[1].v = 2; graph->edge[1].w = 4;
            graph->edge[2].u = 1; graph->edge[2].v = 3; graph->edge[2].w = 3;
            graph->edge[3].u = 2; graph->edge[3].v = 1; graph->edge[3].w = 6;
            graph->edge[4].u = 3; graph->edge[4].v = 2; graph->edge[4].w = 2;

            BellmanFord(graph, 0);
            return 0;


        }
        void BellmanFord(struct Graph* graph, int source)
        {
            int i,j,u,v,w;
            int tV = graph->V;
            int tE = graph->E;
            int dist[tV];
            int parent[tV];
            for(i = 0; i < tV; i++)
            {
                dist[i] = INFINITY;
                parent[i] = -1;
            }
dist[source] = 0;
            for(i = 1; i <= tV - 1; i++)
            {
                for(j = 0; j < tE; j++)
                {
                    u = graph->edge[j].u;
                    v = graph->edge[j].v;
                    w = graph->edge[j].w;
                    if(dist[u] != INFINITY && dist[u] + w < dist[v])
                    {
                        dist[v] = dist[u] + w;
                        parent[v] = u;
                    }
                }
            }
            for(j = 0; j < tE; j++)
            {
                u = graph->edge[j].u;
                v = graph->edge[j].v;
                w = graph->edge[j].w;
                if(dist[u] != INFINITY && dist[u] + w < dist[v])
                {
                    printf("Graph contains negative weight cycle\n");
                    return;
                }
            }
            printf("Distance array:\n");
            display(parent, tV);
        }
        void display(int arr[], int n)
        {
            for(int i = 0; i < n; i++)
            {
                printf("%d ", arr[i]);
            }
            printf("\n");
        }
